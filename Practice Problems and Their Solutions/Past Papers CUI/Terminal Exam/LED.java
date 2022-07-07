public class LED {
    private String company;
    private String color;
    private int size;
    private String modelNo;
    private double price;


    public LED() {
    }

    public LED(String company, String color, int size, String modelNo, double price) {
        this.company = company;
        this.color = color;
        this.size = size;
        this.modelNo = modelNo;
        this.price = price;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModelNo() {
        return this.modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "{" +
            " company='" + getCompany() + "'" +
            ", color='" + getColor() + "'" +
            ", size='" + getSize() + "'" +
            ", modelNo='" + getModelNo() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }



}
