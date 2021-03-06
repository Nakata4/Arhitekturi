/**
 * GetEmailResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Response;

public class GetEmailResponse  implements java.io.Serializable {
    private java.lang.String getEmailReturn;

    public GetEmailResponse() {
    }

    public GetEmailResponse(
           java.lang.String getEmailReturn) {
           this.getEmailReturn = getEmailReturn;
    }


    /**
     * Gets the getEmailReturn value for this GetEmailResponse.
     * 
     * @return getEmailReturn
     */
    public java.lang.String getGetEmailReturn() {
        return getEmailReturn;
    }


    /**
     * Sets the getEmailReturn value for this GetEmailResponse.
     * 
     * @param getEmailReturn
     */
    public void setGetEmailReturn(java.lang.String getEmailReturn) {
        this.getEmailReturn = getEmailReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEmailResponse)) return false;
        GetEmailResponse other = (GetEmailResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEmailReturn==null && other.getGetEmailReturn()==null) || 
             (this.getEmailReturn!=null &&
              this.getEmailReturn.equals(other.getGetEmailReturn())));
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
        if (getGetEmailReturn() != null) {
            _hashCode += getGetEmailReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEmailResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", ">getEmailResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEmailReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "getEmailReturn"));
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
