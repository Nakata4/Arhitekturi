package Client.Demo;

public class UserProxy implements Client.Demo.User {
  private String _endpoint = null;
  private Client.Demo.User user = null;
  
  public UserProxy() {
    _initUserProxy();
  }
  
  public UserProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserProxy();
  }
  
  private void _initUserProxy() {
    try {
      user = (new Response.UserServiceLocator()).getUser();
      if (user != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)user)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)user)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (user != null)
      ((javax.xml.rpc.Stub)user)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Client.Demo.User getUser() {
    if (user == null)
      _initUserProxy();
    return user;
  }
  
  public Client.Demo.Name getName() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getName();
  }
  
  public Client.Demo.Location getLocation() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getLocation();
  }
  
  public void setName(Client.Demo.Name name) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setName(name);
  }
  
  public java.lang.String getLanguage() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getLanguage();
  }
  
  public void setLanguage(java.lang.String language) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setLanguage(language);
  }
  
  public void setLocation(Client.Demo.Location location) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setLocation(location);
  }
  
  public java.lang.String getCurrency() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getCurrency();
  }
  
  public void setCurrency(java.lang.String currency) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setCurrency(currency);
  }
  
  public Client.Demo.Job getJob() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getJob();
  }
  
  public java.lang.String getGender() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getGender();
  }
  
  public void setGender(java.lang.String gender) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setGender(gender);
  }
  
  public java.lang.String getPhone() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getPhone();
  }
  
  public Client.Demo.Login getLogin() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getLogin();
  }
  
  public void setPhone(java.lang.String phone) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setPhone(phone);
  }
  
  public void setJob(Client.Demo.Job job) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setJob(job);
  }
  
  public Client.Demo.Billing getBilling() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getBilling();
  }
  
  public void setBilling(Client.Demo.Billing billing) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setBilling(billing);
  }
  
  public java.lang.String getEmail() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getEmail();
  }
  
  public void setEmail(java.lang.String email) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setEmail(email);
  }
  
  public void setLogin(Client.Demo.Login login) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setLogin(login);
  }
  
  public java.util.HashMap getAdditionalProperties() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getAdditionalProperties();
  }
  
  public void setAdditionalProperty(java.lang.String name, java.lang.Object value) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setAdditionalProperty(name, value);
  }
  
  
}