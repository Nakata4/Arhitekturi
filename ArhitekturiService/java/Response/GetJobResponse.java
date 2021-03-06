/**
 * GetJobResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Response;

import Client.Demo.Job;

public class GetJobResponse  implements java.io.Serializable {
    private Client.Demo.Job getJobReturn;

    public GetJobResponse() {
    }

    public GetJobResponse(
           Client.Demo.Job getJobReturn) {
           this.getJobReturn = getJobReturn;
    }


    /**
     * Gets the getJobReturn value for this GetJobResponse.
     * 
     * @return getJobReturn
     */
    public Client.Demo.Job getGetJobReturn() {
        return getJobReturn;
    }


    /**
     * Sets the getJobReturn value for this GetJobResponse.
     * 
     * @param getJobReturn
     */
    public void setGetJobReturn(Client.Demo.Job getJobReturn) {
        this.getJobReturn = getJobReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetJobResponse)) return false;
        GetJobResponse other = (GetJobResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getJobReturn==null && other.getGetJobReturn()==null) || 
             (this.getJobReturn!=null &&
              this.getJobReturn.equals(other.getGetJobReturn())));
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
        if (getGetJobReturn() != null) {
            _hashCode += getGetJobReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetJobResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", ">getJobResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getJobReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "getJobReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", "Job"));
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
