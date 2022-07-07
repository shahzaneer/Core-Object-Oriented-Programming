public class Parent {
    public double wealth;

    public Parent() {
    }

    public Parent(double wealth) {
        this.wealth = wealth;
    }

    public double getWealth() {
        return this.wealth;
    }

    public void setWealth(double wealth) {
        this.wealth = wealth;
    }

    @Override
    public String toString() {
        return "{" +
                " wealth='" + getWealth() + "'" +
                "}";
    }
}