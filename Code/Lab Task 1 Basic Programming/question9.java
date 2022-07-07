public class question9 {
    public static void main(String[] args) {
        String str = """
        WelcTme tT
        tutTrialspTint.cTm
        """;
        String strm = modified(str);
        System.out.println(strm);
    }
    static String modified(String str){
        String modi = str.replace('T', 'O');
        return modi;
    }
}
