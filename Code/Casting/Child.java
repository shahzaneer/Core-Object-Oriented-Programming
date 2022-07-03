public class Child extends Parent {
    public double paisa;

    public Child() {
    }

    public Child(double paisa) {
        this.paisa = paisa;
    }

    public double getPaisa() {
        return this.paisa;
    }

    public void setPaisa(double paisa) {
        this.paisa = paisa;
    }


    @Override
    public String toString() {
        return "{" +
            " paisa='" + getPaisa() + "'" +
            "}";
    }

}
