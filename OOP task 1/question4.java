public class question4 {
    public static void main(String[]args){
        String str1="Pakistan";
        String str2="A beautiful Country";
        String str = concatenate(str1, str2);
        System.out.println(str);

    }
    static String concatenate(String str1,String str2){
        String con = str1+""+str2;
        return con;
    }
}
