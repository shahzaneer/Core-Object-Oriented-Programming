import java.util.Arrays;
import java.util.List;

// This <T extends Number> means that the type specified will be Number or the sub-classes of T
public class WildCard<T extends Number>{
    private Object arrayList[];
    private int size;
    private static  int DEFAULT_SIZE = 10;

    public WildCard() {
        arrayList = new Object[DEFAULT_SIZE];
    }
    
    public void addlist(List<? extends Number> List ){
        // Do Something
        // List type main Number k saath saath iski subclasses bhi aaskti hain

    }

    private void reSize() {
        Object temp[] = new Object [arrayList.length * 2];
        for (int i = 0; i < arrayList.length; i++) {
            temp[i] = arrayList[i];
        }
        arrayList = temp;
        

    }

    public boolean isFull() {
        return size == arrayList.length;
    }
    
    public void add(T value) {
        if (isFull()) {
            reSize();
        }
        arrayList[size++] = value;
    }
    

    @Override
    public String toString() {
        return Arrays.toString(arrayList);
    }

}