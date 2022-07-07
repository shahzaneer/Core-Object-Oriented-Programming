public abstract class Person{
    private String name;

    public Person() {
    }
    
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean isOutstanding();

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            "}";
    }


}