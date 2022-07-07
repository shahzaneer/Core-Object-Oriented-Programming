import java.util.Arrays;

public class NameCollection implements Enumeration{
    String[] names = new String[10];

    public NameCollection() {
    }

    public NameCollection(String[] names) {
        this.names = names;
    }

    public String[] getNames() {
        return this.names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext(int index) {
        if (names[index] != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object getNext(int index) {
        return names[index];
    }

    @Override
    public String toString() {
        return "{" +
            " names='" + Arrays.toString(getNames())  + "'" +
            "}";
    }

}
