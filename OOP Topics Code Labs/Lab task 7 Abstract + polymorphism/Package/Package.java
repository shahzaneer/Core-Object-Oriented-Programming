public abstract class Package {
    private String senderName;
    private String senderAddress;
    private String recieverName;
    private String recieverAddress;
    private Ounce weight;
    private double costPerOunce;

    public Package() {
    }

    public Package(String senderName, String senderAddress, String recieverName, String recieverAddress, Ounce weight, double costPerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.recieverName = recieverName;
        this.recieverAddress = recieverAddress;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return this.senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getRecieverName() {
        return this.recieverName;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
    }

    public String getRecieverAddress() {
        return this.recieverAddress;
    }

    public void setRecieverAddress(String recieverAddress) {
        this.recieverAddress = recieverAddress;
    }

    public Ounce getWeight() {
        return this.weight;
    }

    public void setWeight(Ounce weight) {
        this.weight = weight;
    }

    public double getCostPerOunce() {
        return this.costPerOunce;
    }

    public void setCostPerOunce(double costPerOunce) {
        this.costPerOunce = costPerOunce;
    }

    // forcibly imposing this method to the childs of this class
    public abstract double calculateCost();

    public double calculateGeneralCost() {
        return (weight.getWeight() * costPerOunce);

    }

    @Override
    public String toString() {
        return "{" +
            " senderName='" + getSenderName() + "'" +
            ", senderAddress='" + getSenderAddress() + "'" +
            ", recieverName='" + getRecieverName() + "'" +
            ", recieverAddress='" + getRecieverAddress() + "'" +
            ", weight='" + getWeight().getWeight() + "'" +
            ", costPerOunce='" + getCostPerOunce() + "'" +
            "}";
    }

    
}
