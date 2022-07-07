public class Runner {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<String>();
        stack1.push("Islamabad");
        stack1.push("Lahore");
        stack1.push("Karachi");

        GenericStack<Integer> stack2 = new GenericStack<Integer>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);


        System.out.println(stack1);
        System.out.println(stack2);


    }
}
