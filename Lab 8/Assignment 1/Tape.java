
package l8ai1;


public class Tape extends Publication {
    
    private int playTimeMinutes;

    public Tape() {
        playTimeMinutes = 0;
    }

    public Tape(int playTimeMinutes) {
        this.playTimeMinutes = playTimeMinutes;
    }

    public Tape(int playTimeMinutes, String title, int price) {
        super(title, price);
        this.playTimeMinutes = playTimeMinutes;
    }

    public void setPlayTimeMinutes(int playTimeMinutes) {
        this.playTimeMinutes = playTimeMinutes;
    }

    public int getPlayTimeMinutes() {
        return playTimeMinutes;
    }

    
    public String display() {
        
        return super.display() + " Tape play time in minutes is: " + playTimeMinutes ;
    }
    
    
    
    
    
    
    
}
