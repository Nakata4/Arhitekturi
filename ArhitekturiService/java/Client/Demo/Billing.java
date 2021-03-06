
package Client.Demo;

public class Billing  implements Serializable {
    private HashMap additionalProperties;
    private Client.Demo.Card card;
    public Billing() {
    }
    public Billing(
           HashMap additionalProperties,
           Client.Demo.Card card) {
           this.additionalProperties = additionalProperties;
           this.card = card;
    }
    public HashMap getAdditionalProperties() {
        return additionalProperties;
    }
    public void setAdditionalProperties(HashMap additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
    public Client.Demo.Card getCard() {
        return card;
    }
    public void setCard(Client.Demo.Card card) {
        this.card = card;
    }
    private Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Billing)) return false;
        Billing other = (Billing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalProperties==null && other.getAdditionalProperties()==null) || 
             (this.additionalProperties!=null &&
              this.additionalProperties.equals(other.getAdditionalProperties()))) &&
            ((this.card==null && other.getCard()==null) || 
             (this.card!=null &&
              this.card.equals(other.getCard())));
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
        if (getAdditionalProperties() != null) {
            _hashCode += getAdditionalProperties().hashCode();
        }
        if (getCard() != null) {
            _hashCode += getCard().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
