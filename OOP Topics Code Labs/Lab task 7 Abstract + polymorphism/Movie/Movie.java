public abstract class Movie {

    private int numberID;
    private String title;
    private int numberOfDaysRented;

    public Movie() {
    }

    public Movie(int numberID, String title, int numberOfDaysRented) {
        this.numberID = numberID;
        this.title = title;
        this.numberOfDaysRented = numberOfDaysRented;
    }

    public int getNumberID() {
        return this.numberID;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfDaysRented() {
        return this.numberOfDaysRented;
    }

    public void setNumberOfDaysRented(int numberOfDaysRented) {
        this.numberOfDaysRented = numberOfDaysRented;
    }

    public boolean equals(Movie that) {
        // It checks the content of two objects only
        if (this.numberID == that.numberID && this.title == that.title
                && this.numberOfDaysRented == that.numberOfDaysRented) {
            return true;
        }
        return false;
    }

    //! Definition from the extension 
    // if (o == this)
    //     return true;
    // if (!(o instanceof Movie)) {
    //     return false;
    // }
    // Movie movie = (Movie) o;
    // return numberID == movie.numberID && Objects.equals(title, movie.title) && numberOfDaysRented == movie.numberOfDaysRented;
    

    @Override
    public String toString() {
        return "{" +
                " numberID='" + getNumberID() + "'" +
                ", title='" + getTitle() + "'" +
                ", numberOfDaysRented='" + getNumberOfDaysRented() + "'" +
                "}";
    }

    public abstract double calcLateFee();

}