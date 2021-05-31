
package project;

import java.util.Scanner;


public class Teacher extends Person implements Association {
    //Data feilds
    private String designation;
    private String department;

    
    //Arrgumented Constructor
    public Teacher(String name, int id) {
        super(name, id);
        
    }

    //Getter
    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    //Setter
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    //Associate method from interface 
    @Override
    public void associate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Designation of teacher");
        this.designation = scan.nextLine();
        System.out.println("Enter Department of Teacher");
        this.department = scan.nextLine();
        
    }
    
    //Overiden getter so that we can have access to it through associate interface
    @Override
    public int getId() {
        return super.getId();
    }
    

    //toString
    @Override
    public String toString() {
        return "Teacher " + super.toString() + " Designation: " + designation + " Department: " + department;
    }
    
    
    
    
    
}
