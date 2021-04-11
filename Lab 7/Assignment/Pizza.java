
package l7asi1;


public class Pizza {
    
    private String size;
    private int numOfCheese;
    private int numOfPepperoni;
    private int numOfHam;

    public Pizza(String size, int numOfCheese, int numOfPepperoni, int numOfHam) {
        this.size = size;
        this.numOfCheese = numOfCheese;
        this.numOfPepperoni = numOfPepperoni;
        this.numOfHam = numOfHam;
    }
    
    public void setSize(String size) {
        this.size = size;
    }

    public void setNumOfCheese(int numOfCheese) {
        this.numOfCheese = numOfCheese;
    }

    public void setNumOfPepperoni(int numOfPepperoni) {
        this.numOfPepperoni = numOfPepperoni;
    }

    public void setNumOfHam(int numOfHam) {
        this.numOfHam = numOfHam;
    }

    public String getSize() {
        return size;
    }

    public int getNumOfCheese() {
        return numOfCheese;
    }

    public int getNumOfPepperoni() {
        return numOfPepperoni;
    }

    public int getNumOfHam() {
        return numOfHam;
    }
    
    public double calcCost(){
        if("small".equals(size.toLowerCase())){
            
            return (10 + (2*numOfCheese) + (2*numOfPepperoni) + (2*numOfHam));
        }
        else if("medium".equals(size.toLowerCase())){
            return (12 + (2*numOfCheese) + (2*numOfPepperoni) + (2*numOfHam));
        }
        else if("medium".equals(size.toLowerCase())){
            return (14 + (2*numOfCheese) + (2*numOfPepperoni) + (2*numOfHam));
        }
        else{
            System.out.println("Please select the correct size");
            return 0;
        }
            
    }
    
    public String getDescription() {
        return "Pizza{" + "size=" + size + ", numOfCheese=" + numOfCheese + ", numOfPepperoni=" + numOfPepperoni + ", numOfHam=" + numOfHam + '}';
    }
    
    

    
    
    
    
}
