public class ShoppingCart {
    private Shop shop;
    private String cartNo;
    Arraylist cart = new Arraylist();


    public ShoppingCart() {
    }

    public ShoppingCart(Shop shop, String cartNo) {
        this.shop = shop;
        this.cartNo = cartNo;
    }

    public Shop getShop() {
        return this.shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getCartNo() {
        return this.cartNo;
    }

    public void setCartNo(String cartNo) {
        this.cartNo = cartNo;
    }

    void buyMobile(String nameOfPhone) {
        if(shop)
    }

    void buyLED() {

    }
    
    void checkout() {

    }
    void showDetailCart(){}


    @Override
    public String toString() {
        return "{" +
            " shop='" + getShop().toString() + "'" +
            ", cartNo='" + getCartNo() + "'" +
            "}";
    }

}
