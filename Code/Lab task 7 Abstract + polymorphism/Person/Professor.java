public class Professor extends Person {
    private int numberOfPublications;

    public Professor() {
        
    }

    public Professor(String name, int numberOfPublications) {
        super(name);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return this.numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public boolean isOutstanding() {
        if (this.numberOfPublications >= 50) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +  "{" +
            " numberOfPublications='" + getNumberOfPublications() + "'" +
            "}";
    }



}