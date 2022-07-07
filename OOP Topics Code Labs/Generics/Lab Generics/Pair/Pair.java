public class Pair<T> {
    private T first;
    private T second;


    public Pair() {
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return this.second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "{" +
            " first='" + getFirst().toString() + "'" +
            ", second='" + getSecond().toString() + "'" +
            "}";
    }

}
