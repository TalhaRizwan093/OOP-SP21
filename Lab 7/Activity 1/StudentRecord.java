
package l7a1;

class StudentRecord {
    
    private String degree;
    
    StudentRecord() {
    }

    StudentRecord(String degree) {
        this.degree = degree;
    }
    
    public void setDegree ( String deg)
    {
        degree = deg;
    }
    public String getDegree ()
    {
        return degree;
    }
    
    
}
