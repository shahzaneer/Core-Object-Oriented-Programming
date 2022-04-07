public class Runner {
    public static void main(String[] args) {
        Simple obj = new Simple(5,0);

        VerifiedSimple obj1 = new VerifiedSimple(5,0);
        System.out.println(obj.mul());
        System.out.println(obj1.mul());

        //! It will return -1 in case of zero 
        //! it will return answer in case of non zero values
        
    }
}
