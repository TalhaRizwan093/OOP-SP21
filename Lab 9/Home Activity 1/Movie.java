
package l9h1;


public class Movie {
    
    private String MPAA;
    private int idNumber;
    private String movieTitle;

    public Movie(String MPAA, int idNumber, String movieTitle) {
        this.MPAA = MPAA;
        this.idNumber = idNumber;
        this.movieTitle = movieTitle;
    }

    public String getMPAA() {
        return MPAA;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMPAA(String MPAA) {
        this.MPAA = MPAA;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @Override
    public String toString() {
        return "Movie\n" + "Rated" + MPAA + "\nidNumber:" + idNumber + "\nmovieTitle=" + movieTitle;
    }
    
    

    @Override
    public boolean equals(Object o) {
        if(this.getIdNumber() == ((Movie)o).getIdNumber()){
            return true;
        }
        else
            return false;
    }
    
    public double calcLateFees(int numOfDays){
        return 2*numOfDays;
    }
    
    
}
