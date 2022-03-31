public class Runner {
    public static void main(String[] args) {


        // sub-parts
        Pizza p1 = new Pizza("large", 2, 1, 2);
        Pizza p2 = new Pizza("medium", 2, 1, 2);
        Pizza p3 = new Pizza("small", 2, 0, 2);


        // parts 
        PizzaOrder po = new PizzaOrder();

        po.setPizza1(p1);
        po.setPizza2(p2);
        System.out.println(po.calcTotal());
        po.getPizza2().getDescription();

    }
}
