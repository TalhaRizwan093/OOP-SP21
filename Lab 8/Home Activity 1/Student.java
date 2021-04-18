
package l8h1;


public class Student extends Person {
    
    private String status;

    public Student() {
        status = "";
    }

    public Student(String status, String name, String address, String email) {
        super(name, address, email);
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    public void display(){
        super.display();
        System.out.println("Student status: "+ status);
    }
    
    
    
}
