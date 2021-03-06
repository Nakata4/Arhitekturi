/**
 * GetLocationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Response;

import Client.Demo.Location;

public class GetLocationResponse  implements java.io.Serializable {
    private Client.Demo.Location getLocationReturn;

    public GetLocationResponse() {
    }

    public GetLocationResponse(
           Client.Demo.Location getLocationReturn) {
           this.getLocationReturn = getLocationReturn;
    }


    /**
     * Gets the getLocationReturn value for this GetLocationResponse.
     * 
     * @return getLocationReturn
     */
    public Client.Demo.Location getGetLocationReturn() {
        return getLocationReturn;
    }


    /**
     * Sets the getLocationReturn value for this GetLocationResponse.
     * 
     * @param getLocationReturn
     */
    public void setGetLocationReturn(Client.Demo.Location getLocationReturn) {
        this.getLocationReturn = getLocationReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLocationResponse)) return false;
        GetLocationResponse other = (GetLocationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLocationReturn==null && other.getGetLocationReturn()==null) || 
             (this.getLocationReturn!=null &&
              this.getLocationReturn.equals(other.getGetLocationReturn())));
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
        if (getGetLocationReturn() != null) {
            _hashCode += getGetLocationReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLocationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", ">getLocationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLocationReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "getLocationReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", "Location"));
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
