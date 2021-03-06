/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Client.Demo;

public interface User extends java.rmi.Remote {
    public Client.Demo.Name getName() throws java.rmi.RemoteException;
    public Client.Demo.Location getLocation() throws java.rmi.RemoteException;
    public void setName(Client.Demo.Name name) throws java.rmi.RemoteException;
    public java.lang.String getLanguage() throws java.rmi.RemoteException;
    public void setLanguage(java.lang.String language) throws java.rmi.RemoteException;
    public void setLocation(Client.Demo.Location location) throws java.rmi.RemoteException;
    public java.lang.String getCurrency() throws java.rmi.RemoteException;
    public void setCurrency(java.lang.String currency) throws java.rmi.RemoteException;
    public Client.Demo.Job getJob() throws java.rmi.RemoteException;
    public java.lang.String getGender() throws java.rmi.RemoteException;
    public void setGender(java.lang.String gender) throws java.rmi.RemoteException;
    public java.lang.String getPhone() throws java.rmi.RemoteException;
    public Client.Demo.Login getLogin() throws java.rmi.RemoteException;
    public void setPhone(java.lang.String phone) throws java.rmi.RemoteException;
    public void setJob(Client.Demo.Job job) throws java.rmi.RemoteException;
    public Client.Demo.Billing getBilling() throws java.rmi.RemoteException;
    public void setBilling(Client.Demo.Billing billing) throws java.rmi.RemoteException;
    public java.lang.String getEmail() throws java.rmi.RemoteException;
    public void setEmail(java.lang.String email) throws java.rmi.RemoteException;
    public void setLogin(Client.Demo.Login login) throws java.rmi.RemoteException;
    public java.util.HashMap getAdditionalProperties() throws java.rmi.RemoteException;
    public void setAdditionalProperty(java.lang.String name, java.lang.Object value) throws java.rmi.RemoteException;
}
