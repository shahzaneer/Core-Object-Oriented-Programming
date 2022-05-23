public class ArraylistaAdt<T> {
    T[] arr;

    void append(T x) {
        if (arr == null) {
            // arr = new T[1]; //!This is invalid!
            //? Why?
            // * T will be resolved on compile time while the new keyword is resolved during runtime therefor we are facing error.
            arr = (T[]) new Object[1];
            arr[0] = x;
        }
        else {
            extendArray();
            arr[arr.length - 1] = x;

        }
        
    }

    private void extendArray() {
        
    }

}
