/**
 * GetLanguageResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Response;

public class GetLanguageResponse  implements java.io.Serializable {
    private java.lang.String getLanguageReturn;

    public GetLanguageResponse() {
    }

    public GetLanguageResponse(
           java.lang.String getLanguageReturn) {
           this.getLanguageReturn = getLanguageReturn;
    }


    /**
     * Gets the getLanguageReturn value for this GetLanguageResponse.
     * 
     * @return getLanguageReturn
     */
    public java.lang.String getGetLanguageReturn() {
        return getLanguageReturn;
    }


    /**
     * Sets the getLanguageReturn value for this GetLanguageResponse.
     * 
     * @param getLanguageReturn
     */
    public void setGetLanguageReturn(java.lang.String getLanguageReturn) {
        this.getLanguageReturn = getLanguageReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLanguageResponse)) return false;
        GetLanguageResponse other = (GetLanguageResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLanguageReturn==null && other.getGetLanguageReturn()==null) || 
             (this.getLanguageReturn!=null &&
              this.getLanguageReturn.equals(other.getGetLanguageReturn())));
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
        if (getGetLanguageReturn() != null) {
            _hashCode += getGetLanguageReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLanguageResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", ">getLanguageResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLanguageReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "getLanguageReturn"));
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
