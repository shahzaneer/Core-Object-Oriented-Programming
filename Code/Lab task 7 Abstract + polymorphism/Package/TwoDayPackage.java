public class TwoDayPackage extends Package {
    private double flatFee;

    public TwoDayPackage(String senderName, String senderAddress, String recieverName, String recieverAddress,
            Ounce weight, double costPerOunce, double flatFee) {
        super(senderName, senderAddress, recieverName, recieverAddress, weight, costPerOunce);
        this.flatFee = flatFee;

    }

    public double getFlatFee() {
        return this.flatFee;
    }

    public void setFlatFee(double flatFee) {
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateGeneralCost() + flatFee;
    }


    @Override
    public String toString() {
        return super.toString() +
            " flatFee='" + getFlatFee() + "'" +
            "}";
    }

}
