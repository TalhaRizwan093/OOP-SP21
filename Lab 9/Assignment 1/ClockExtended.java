package l9asi1;

class ClockExtended extends Clock{
    
    private String AmPm;

    public ClockExtended(String AmPm) {
        this.AmPm = AmPm;
    }

    public ClockExtended(String AmPm, int hr, int min, int sec) {
        super(hr, min, sec);
        this.AmPm = AmPm;
    }
    
    public String hours24(){
        int hours = super.getHr();
        if("pm".equals(AmPm.toLowerCase())){
            
            return hours+12 + ":" + super.getMin() + ":" + super.getSec();
        
        }
        else
            return hours + ":" + super.getMin() + ":" + super.getSec();
    }

    public void setAmPm(String AmPm) {
        this.AmPm = AmPm;
    }

    public String getAmPm() {
        return AmPm;
    }

    
    public String display() {
        return "The time is: " + super.display() + " " + AmPm + "\nTime in 24 hours clock is: " + hours24();
    }
    
    
}