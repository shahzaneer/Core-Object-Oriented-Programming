public class Contact {
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String emailAddress;


    public Contact() {
    }

    public Contact(String firstName, String secondName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    
    // public boolean equals(Contact xd) {
        
    
    //         return (this.firstName == xd.firstName && this.secondName == xd.secondName
    //                 && this.emailAddress == xd.emailAddress && this.phoneNumber == xd.phoneNumber);
    // }

    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", secondName='" + getSecondName() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", emailAddress='" + getEmailAddress() + "'" +
            "}";
    }


}
