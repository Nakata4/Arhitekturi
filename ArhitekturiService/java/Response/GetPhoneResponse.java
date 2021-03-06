/**
 * GetPhoneResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Response;

public class GetPhoneResponse  implements java.io.Serializable {
    private java.lang.String getPhoneReturn;

    public GetPhoneResponse() {
    }

    public GetPhoneResponse(
           java.lang.String getPhoneReturn) {
           this.getPhoneReturn = getPhoneReturn;
    }


    /**
     * Gets the getPhoneReturn value for this GetPhoneResponse.
     * 
     * @return getPhoneReturn
     */
    public java.lang.String getGetPhoneReturn() {
        return getPhoneReturn;
    }


    /**
     * Sets the getPhoneReturn value for this GetPhoneResponse.
     * 
     * @param getPhoneReturn
     */
    public void setGetPhoneReturn(java.lang.String getPhoneReturn) {
        this.getPhoneReturn = getPhoneReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPhoneResponse)) return false;
        GetPhoneResponse other = (GetPhoneResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPhoneReturn==null && other.getGetPhoneReturn()==null) || 
             (this.getPhoneReturn!=null &&
              this.getPhoneReturn.equals(other.getGetPhoneReturn())));
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
        if (getGetPhoneReturn() != null) {
            _hashCode += getGetPhoneReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPhoneResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", ">getPhoneResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPhoneReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "getPhoneReturn"));
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
