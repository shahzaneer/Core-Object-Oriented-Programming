public class Runner {
    static public boolean searchKeyword(Object obj,String keyword){
        if(obj.toString().contains(keyword)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        File f1 = new File("Hope y'all doing well! ", "C/Codes/Abcs/");
        Email e1 = new Email("Hope y'all doing well!", "Zain" , "Well Being", "Shahzaneer Ahmed");
        System.out.println(searchKeyword(f1,"Hope"));
        System.out.println(searchKeyword(e1,"kaleem"));
        System.out.println(e1.toString());
    }
}
