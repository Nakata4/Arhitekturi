
package Client.Demo;

public class Date  implements Serializable {
    private HashMap additionalProperties;
    private String date;
    private String timezone;
    private Integer timezoneType;

    public Date() {
    }

    public Date(
           HashMap additionalProperties,
           String date,
           String timezone,
           Integer timezoneType) {
           this.additionalProperties = additionalProperties;
           this.date = date;
           this.timezone = timezone;
           this.timezoneType = timezoneType;
    }
    public HashMap getAdditionalProperties() {
        return additionalProperties;
    }
    public void setAdditionalProperties(HashMap additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    public Integer getTimezoneType() {
        return timezoneType;
    }
    public void setTimezoneType(Integer timezoneType) {
        this.timezoneType = timezoneType;
    }
    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Date)) return false;
        Date other = (Date) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalProperties==null && other.getAdditionalProperties()==null) || 
             (this.additionalProperties!=null &&
              this.additionalProperties.equals(other.getAdditionalProperties()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.timezoneType==null && other.getTimezoneType()==null) || 
             (this.timezoneType!=null &&
              this.timezoneType.equals(other.getTimezoneType())));
        __equalsCalc = null;
        return _equals;
    }
    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdditionalProperties() != null) {
            _hashCode += getAdditionalProperties().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getTimezoneType() != null) {
            _hashCode += getTimezoneType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
    private static TypeDesc typeDesc =
        new TypeDesc(Date.class, true);

    static {
        typeDesc.setXmlType(new QName("http://Demo.Client", "Date"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("additionalProperties");
        elemField.setXmlName(new QName("http://Demo.Client", "additionalProperties"));
        elemField.setXmlType(new QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new QName("http://Demo.Client", "date"));
        elemField.setXmlType(new ("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new QName("http://Demo.Client", "timezone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timezoneType");
        elemField.setXmlName(new QName("http://Demo.Client", "timezoneType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }
    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }
    public static Serializer getSerializer(
           String mechType, 
           Class _javaType,  
           QName _xmlType) {
        return 
          new  BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }
    public static Deserializer getDeserializer(
           String mechType, 
           Class _javaType,  
           QName _xmlType) {
        return 
          new  BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
