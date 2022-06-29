import java.util.Arrays;

public class CustomGeneric<T>{
    private Object arrayList[];
    private int size;
    private static  int DEFAULT_SIZE = 10;

    public CustomGeneric() {
        arrayList = new Object[DEFAULT_SIZE];
        //idhar humne T ki bjaye Object isliay lia hai k jb hum dynamically declare kr rhay hote hain tou compile time per pta hona chahiay k kia declare kr rhay hain.
    }

    private void reSize() {
        Object temp[] = new Object [arrayList.length * 2];
        for (int i = 0; i < arrayList.length; i++) {
            temp[i] = arrayList[i];
        }
        arrayList = temp;
        

    }

    public boolean isFull() {

        // if (size == arrayList.length) {
        //     return true;
        // }
        // return false;

        // !this if else can be minimized by using the below code

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