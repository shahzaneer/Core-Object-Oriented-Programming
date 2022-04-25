public class Runner {
    public static void main(String[] args) {
        payable P [] = new payable[2];
        P[0] = new Invoice("SP21-BCS-087", "CHARGES", 3, 10);
        P[1] = new SalariedEmployee("Sameem", "Amjad", "SP21-BCS-081", 7000);

        for (int i = 0; i < P.length; i++) {
            System.out.println(P[i].toString());
            System.out.println(P[i].getPaymentAmount());
        }

        
    }
}