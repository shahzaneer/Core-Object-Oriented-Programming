public class Invoice implements payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    public Invoice() {
    }

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return this.partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }


    @Override
    public String toString() {
        return "{" +
            " partNumber='" + getPartNumber() + "'" +
            ", partDescription='" + getPartDescription() + "'" +
            ", quantity='" + getQuantity() + "'" +
            ", pricePerItem='" + getPricePerItem() + "'" +
            "}";
    }

}
