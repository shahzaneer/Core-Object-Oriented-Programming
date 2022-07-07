public class Runner {
    public static void main(String[] args) {
        GenericDrawing <String> box1 = new GenericDrawing<>();
        GenericDrawing<Integer> box2 = new GenericDrawing<>();
        
        box1.add("Shahzaneer Ahmed");
        box1.add("Data Scientist");
        box1.add("Mobile App Developer");
        box1.add("Entrepreneur");
        box1.add("Community Builder");


        box2.add(1);
        box2.add(2);
        box2.add(3);
        box2.add(4);
        box2.add(5);
        box2.add(6);


        System.out.println(box1.drawItem());
        System.out.println(box2.drawItem());
        
        
    }
}
