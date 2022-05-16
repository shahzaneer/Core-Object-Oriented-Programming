public class CheckEvenOrOdd {
    private int num;

    public CheckEvenOrOdd(int number) {
        this.num = number;
    }

    public boolean checkEvenOrOdd() {

        // The Writing of if else statement or Ternary Operator or making check variables in stack is highly discouraged
        // Using the below practice it can minimize the code lines + readability is also maintained!
        return num % 2 == 0;
    }


    public static void main(String[] args) {
        CheckEvenOrOdd n1 = new CheckEvenOrOdd(12);
        System.out.println(n1.checkEvenOrOdd());
    }

}
