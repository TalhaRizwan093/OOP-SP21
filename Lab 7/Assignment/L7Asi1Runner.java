
package l7asi1;

import java.util.Scanner;

public class L7Asi1Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfPizza;
        Pizza testP1 = new Pizza("SMALL",2,2,1);
        Pizza testP2 = new Pizza("Medium",4,4,2);
        System.out.println("-----Test Pizza--------");
        System.out.println("Total cost is: " + testP1.calcCost()+ "$");
        System.out.println("Total cost is: " + testP2.calcCost()+ "$");
        System.out.println("Detail of Pizza: " + testP1.getDescription());
        System.out.println("Detail of Pizza: " + testP2.getDescription());

        System.out.println("------Pizza Order-------");
        String size, check;
        int numOfPepperoni, numOfCheese, numOfHam;
        while(true){
            System.out.println("Order Pizza Max order 3 for 1 customer");
            System.out.println("How Many Pizza do you want to order?");
            PizzaOrder o = new PizzaOrder();
            numOfPizza = scan.nextInt();
            for(int i = 0; i<numOfPizza; i++){
                System.out.println("Enter size of Pizza" + i+1 + " Must be Small, Medium or Large: ");
                System.out.println("Small cost 10$ \nMedium cost 12$ \nLarge cost 14$ ");
                size = scan.next();
                System.out.println("Enter number of Cheez Topping 2$ each: ");
                numOfCheese = scan.nextInt();
                System.out.println("Enter number of Pepperoni Topping 2$ each: ");
                numOfPepperoni = scan.nextInt();
                System.out.println("Enter number of Ham Topping 2$ each: ");
                numOfHam = scan.nextInt();
                o.setOrder(i, size, numOfPepperoni, numOfCheese, numOfHam);
            }
        
            System.out.println("Total cost of the Order is: " + o.calcTotal());
            System.out.println("Are there more customers Press Y to continue and N to exit");
            check = scan.next();
            if("y".equals(check) || "Y".equals(check)){
            }
            else break;
        }
        
        
        
    }
    
}
