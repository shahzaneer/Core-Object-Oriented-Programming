import java.util.ArrayList;

public class GenericStack<E>{
    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = list.get(getSize() - 1); //last element will be returned
        list.remove(getSize() - 1);

        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack : " + list.toString();
        // As Arraylist is object type so it has toString method.
    }
    

}