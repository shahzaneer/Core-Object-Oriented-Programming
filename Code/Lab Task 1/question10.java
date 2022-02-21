public class question10 {
    public static void main(String [] args){
    String email_address = "shahism01@gmail.com";
    String user = extractor(email_address);
    System.out.println("The user name is "+user);
    }
    static String extractor (String email){
        String username;
        username = email.substring(0, email.indexOf("@"));
        return username;
    }
    
}
