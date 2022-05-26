import java.util.ArrayList;
import java.util.Random;

public class GenericDrawing<T> {
    ArrayList<T> box = new ArrayList<>();

    public void add(T item) {
        box.add(item);

    }
    
    public boolean isEmpty() {
        int size = box.size();
        return size == 0;
    }
    
    public T drawItem() {
        if (isEmpty())
            return null;

        T drawingItem = null;
//      random choice
        // int randomChoice = (int) Math.random() * box.size();
        Random r = new Random();
        int randomChoice = r.nextInt(box.size());
        drawingItem = box.get(randomChoice);
        // box.remove(randomChoice);
            return drawingItem; 
    }

}