
package l7asi1;

public class L7Asi1Runner {

    public static void main(String[] args) {
        
        Pizza p1 = new Pizza("SMALL",2,2,1);
        Pizza p2 = new Pizza("Medium",4,4,2);
        PizzaOrder o = new PizzaOrder();
        o.setNumOfPizza(2);
        o.setP1(p1);
        o.setP2(p2);
        System.out.println("Total cost is: " + o.calcTotal());
        
        
    }
    
}
