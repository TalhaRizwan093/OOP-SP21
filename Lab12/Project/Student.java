
package project;

import java.util.Scanner;

public class Student extends Person implements Association {
    //Data feilds
    private int rollNo;
    private int semester;

    
    //Arrgumented Constructor
    public Student(String name, int id) {
        super(name, id);
        
    }

    //Getter
    public int getRollNo() {
        return rollNo;
    }
    
    public int getsemester() {
        return semester;
    }

    //Setter
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
    public void setsemester(int semester) {
        this.semester = semester;
    }

    //Associate method from interface 
    @Override
    public void associate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter roll number of student: ");
        this.rollNo = scan.nextInt();
        System.out.println("Enter Semester of student: ");
        this.semester = scan.nextInt();
    }
    

    //Overiden getter so that we can have access to it through associate interface
    @Override
    public int getId() {
        return super.getId();
    }


    //toString
    @Override
    public String toString() {
        return "Student" + super.toString() + " RollNo: " + rollNo + " Semester: " + semester;
    }
    
    
    
    
    
}
