public class Inventoryitem implements Compare{
    
    private String name;
    private int uniqueItemID;


    public Inventoryitem() {
    }

    public Inventoryitem(String name, int uniqueItemID) {
        this.name = name;
        this.uniqueItemID = uniqueItemID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniqueItemID() {
        return this.uniqueItemID;
    }

    public void setUniqueItemID(int uniqueItemID) {
        this.uniqueItemID = uniqueItemID;
    }


    @Override
    public boolean compareObjects(Object o) {
        if(this == o){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", uniqueItemID='" + getUniqueItemID() + "'" +
            "}";
    }

}
