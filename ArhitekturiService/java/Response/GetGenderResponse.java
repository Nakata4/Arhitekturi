/**
 * GetGenderResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Response;

public class GetGenderResponse  implements java.io.Serializable {
    private java.lang.String getGenderReturn;

    public GetGenderResponse() {
    }

    public GetGenderResponse(
           java.lang.String getGenderReturn) {
           this.getGenderReturn = getGenderReturn;
    }


    /**
     * Gets the getGenderReturn value for this GetGenderResponse.
     * 
     * @return getGenderReturn
     */
    public java.lang.String getGetGenderReturn() {
        return getGenderReturn;
    }


    /**
     * Sets the getGenderReturn value for this GetGenderResponse.
     * 
     * @param getGenderReturn
     */
    public void setGetGenderReturn(java.lang.String getGenderReturn) {
        this.getGenderReturn = getGenderReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGenderResponse)) return false;
        GetGenderResponse other = (GetGenderResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGenderReturn==null && other.getGetGenderReturn()==null) || 
             (this.getGenderReturn!=null &&
              this.getGenderReturn.equals(other.getGetGenderReturn())));
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
        if (getGetGenderReturn() != null) {
            _hashCode += getGetGenderReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGenderResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", ">getGenderResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGenderReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "getGenderReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
