
package l7asi1;


public class PizzaOrder {
    private Pizza[] p = new Pizza[3];
    
    
    public PizzaOrder(){
        
        p[0] = null;
        p[1] = null;
        p[2] = null;
    }
    public void setOrder(int i,String size, int numberOfPepperoni, int numberOfCheese, int numberOfHam){
        p[i] = new Pizza(size,numberOfPepperoni,numberOfCheese,numberOfHam);
        
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

    
    public Pizza getP1() {
        return p[0];
    }

    public Pizza getP2() {
        return p[1];
    }

    public Pizza getP3() {
        return p[2];
    }
    

    

    public double calcTotal(){
        double cost = 0;
        for(int i = 0 ; i<3; i++){
            if(p[i] != null){
                cost = cost + p[i].calcCost();
            }
        }
        return cost;
    }
    
}
