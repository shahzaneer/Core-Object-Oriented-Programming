public class OverNightPackage extends Package {
    private double additionalFee;

    public OverNightPackage(String senderName, String senderAddress, String recieverName, String recieverAddress,
            Ounce weight, double costPerOunce, double additionalFee) {
        super(senderName, senderAddress, recieverName, recieverAddress, weight, costPerOunce);
        this.additionalFee = additionalFee;
    }

    

    public double getAdditionalFee() {
        return this.additionalFee;
    }

    public void setAdditionalFee(double additionalFee) {
        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateGeneralCost() + additionalFee;
    }


    

    @Override
    public String toString() {
        return super.toString()+
            " additionalFee='" + getAdditionalFee() + "'" +
            "}";
    }
}