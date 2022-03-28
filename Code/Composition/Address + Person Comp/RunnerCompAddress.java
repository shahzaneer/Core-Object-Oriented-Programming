
public class RunnerCompAddress {
    public static void main(String[] args) {
        Address a1 = new Address(34,"NIH Colony","Islamabad");
        Person p1 = new Person("Shahzaneer", "Ahmed", a1);
        p1.display();
        System.out.println(p1.checkCapital());
    }
}
