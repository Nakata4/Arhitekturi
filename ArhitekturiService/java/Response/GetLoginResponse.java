/**
 * GetLoginResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Response;

import Client.Demo.Login;

public class GetLoginResponse  implements java.io.Serializable {
    private Client.Demo.Login getLoginReturn;

    public GetLoginResponse() {
    }

    public GetLoginResponse(
           Client.Demo.Login getLoginReturn) {
           this.getLoginReturn = getLoginReturn;
    }


    /**
     * Gets the getLoginReturn value for this GetLoginResponse.
     * 
     * @return getLoginReturn
     */
    public Client.Demo.Login getGetLoginReturn() {
        return getLoginReturn;
    }


    /**
     * Sets the getLoginReturn value for this GetLoginResponse.
     * 
     * @param getLoginReturn
     */
    public void setGetLoginReturn(Client.Demo.Login getLoginReturn) {
        this.getLoginReturn = getLoginReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLoginResponse)) return false;
        GetLoginResponse other = (GetLoginResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLoginReturn==null && other.getGetLoginReturn()==null) || 
             (this.getLoginReturn!=null &&
              this.getLoginReturn.equals(other.getGetLoginReturn())));
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
        if (getGetLoginReturn() != null) {
            _hashCode += getGetLoginReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLoginResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", ">getLoginResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLoginReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "getLoginReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", "Login"));
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
