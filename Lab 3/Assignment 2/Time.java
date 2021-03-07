public class Time {
    
    private int hour;
    private int minute;
    private int second;
    
    public Time(){
        hour = 24;
        minute = 60;
        second = 60;
    }
    
    public Time(int hr, int min, int sec){
        if( hr <= 24 && hr >= 0){
            hour = hr;
        }
        else{
            System.out.println("Hours must be in between 0-24");
        }
        
        if( min <= 60 && min >= 0){
            minute = min;
        }
        else{
            System.out.println("Minute must be in between 0-60");
        }
        
        if( sec <= 60 && sec >= 0){
            second = sec;
        }
        else{
            System.out.println("Seconds must be in between 0-60");
        }
        
    }
    
    public void displayTime(){
        System.out.println("The current time is: " + hour + ":" + minute + ":"+ second);
    }
    
}
