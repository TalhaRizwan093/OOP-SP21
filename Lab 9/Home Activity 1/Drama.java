
package l9h1;


public class Drama extends Movie {
    
    
    public Drama(String MPAA, int idNumber, String movieTitle) {
        super(MPAA, idNumber, movieTitle);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    

    @Override
    public double calcLateFees(int numOfDays) {
        return 2*numOfDays;
    }
    
    
    
}
