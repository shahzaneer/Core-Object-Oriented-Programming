public class Runner {
    public static void main(String[] args) {
        
        Inventoryitem i1 = new Inventoryitem("Vigo", 6);
        Inventoryitem i2 = new Inventoryitem("Vigo", 6);

        System.out.println(i1.compareObjects(i2)); //Because these are two different Object
        // As the memory is newly declared for both!

        System.out.println(i1.compareObjects(i1)); //same object --> true


        
    }
    
}
