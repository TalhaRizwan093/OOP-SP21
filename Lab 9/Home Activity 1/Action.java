
package l9h1;


public class Action extends Movie {
    
    public Action(String MPAA, int idNumber, String movieTitle) {
        super(MPAA, idNumber, movieTitle);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    

    @Override
    public double calcLateFees(int numOfDays) {
        return 3*numOfDays;
    }
    
    
    
}
