public class Student extends Person {
    private String regID;
    private String password;


    public Student() {
    }

    public Student(String name, int age, String regID, String password) {
        super(name, age);
        this.regID = regID;
        this.password = password;
    }

    public String getRegID() {
        return this.regID;
    }

    public void setRegID(String regID) {
        this.regID = regID;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() +"{" +
            " regID='" + getRegID() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }

}
