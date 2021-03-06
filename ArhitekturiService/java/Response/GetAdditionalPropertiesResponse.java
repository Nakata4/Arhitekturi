/**
 * GetAdditionalPropertiesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Response;

public class GetAdditionalPropertiesResponse  implements java.io.Serializable {
    private java.util.HashMap getAdditionalPropertiesReturn;

    public GetAdditionalPropertiesResponse() {
    }

    public GetAdditionalPropertiesResponse(
           java.util.HashMap getAdditionalPropertiesReturn) {
           this.getAdditionalPropertiesReturn = getAdditionalPropertiesReturn;
    }


    /**
     * Gets the getAdditionalPropertiesReturn value for this GetAdditionalPropertiesResponse.
     * 
     * @return getAdditionalPropertiesReturn
     */
    public java.util.HashMap getGetAdditionalPropertiesReturn() {
        return getAdditionalPropertiesReturn;
    }


    /**
     * Sets the getAdditionalPropertiesReturn value for this GetAdditionalPropertiesResponse.
     * 
     * @param getAdditionalPropertiesReturn
     */
    public void setGetAdditionalPropertiesReturn(java.util.HashMap getAdditionalPropertiesReturn) {
        this.getAdditionalPropertiesReturn = getAdditionalPropertiesReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAdditionalPropertiesResponse)) return false;
        GetAdditionalPropertiesResponse other = (GetAdditionalPropertiesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAdditionalPropertiesReturn==null && other.getGetAdditionalPropertiesReturn()==null) || 
             (this.getAdditionalPropertiesReturn!=null &&
              this.getAdditionalPropertiesReturn.equals(other.getGetAdditionalPropertiesReturn())));
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
        if (getGetAdditionalPropertiesReturn() != null) {
            _hashCode += getGetAdditionalPropertiesReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAdditionalPropertiesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", ">getAdditionalPropertiesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAdditionalPropertiesReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "getAdditionalPropertiesReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
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
