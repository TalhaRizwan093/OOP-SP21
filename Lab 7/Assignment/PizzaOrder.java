
package l7asi1;


public class PizzaOrder {
    private Pizza[] p = new Pizza[3];
    private int numOfPizza;
    
    public PizzaOrder(){
        numOfPizza = 0;
        p[0] = null;
        p[1] = null;
        p[2] = null;
    }
    
    public void setP1(Pizza p1) {
        this.p[0] = p1;
    }

    public void setP2(Pizza p2) {
        this.p[1] = p2;
    }

    public void setP3(Pizza p3) {
        this.p[2] = p3;
    }

    public void setNumOfPizza(int numOfPizza) {
        this.numOfPizza = numOfPizza;
    }
    
    public Pizza getP1() {
        return p[0];
    }

    public Pizza getP2() {
        return p[1];
    }

    public Pizza getP3() {
        return p[2];
    }

    public int getNumOfPizza() {
        return numOfPizza;
    }
    

    

    public double calcTotal(){
        double cost = 0;
        for(int i = 0 ; i<numOfPizza; i++){
            cost = cost + p[i].calcCost();
        }
        return cost;
    }
    
}
