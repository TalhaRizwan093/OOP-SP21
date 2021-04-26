package l9asi1;

class Clock{
    private int hr;
    private int min;
    private int sec;

    public Clock() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    public Clock(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getHr() {
        return hr;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public String display() {
        return hr + ":" + min + ":" + sec;
    }
    
    
    
}