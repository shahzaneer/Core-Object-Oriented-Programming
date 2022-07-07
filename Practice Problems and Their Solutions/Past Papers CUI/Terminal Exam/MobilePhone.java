public class MobilePhone {
    private String company;
    private String color;
    private boolean touchScreen;
    private String modelNo;
    private double price;


    public MobilePhone() {
    }

    public MobilePhone(String company, String color, boolean touchScreen, String modelNo, double price) {
        this.company = company;
        this.color = color;
        this.touchScreen = touchScreen;
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

    public boolean isTouchScreen() {
        return this.touchScreen;
    }

    public boolean getTouchScreen() {
        return this.touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
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
            ", touchScreen='" + isTouchScreen() + "'" +
            ", modelNo='" + getModelNo() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }


}
