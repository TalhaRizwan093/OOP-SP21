
package h1a1;

import java.util.Scanner;


public class StudentManag {
    Scanner scan = new Scanner(System.in);
    private String studentName;
    private int studentId;
    private int studentAge;
    private String year;
    private String section;
    
    public void setParameters(){
        
        System.out.print("Enter student Name: ");
        studentName = scan.next();
        System.out.print("Enter student Id: ");
        studentId = scan.nextInt();
        System.out.print("Enter student Age: ");
        studentAge = scan.nextInt();
        System.out.print("Enter student Year: ");
        year = scan.next();
        System.out.print("Enter student Section: ");
        section = scan.next();
    }
    
    public void displayStudent(){
        System.out.println("Student Name is: " + studentName + "\nStudent Id is: "+ studentId +"\nStudent Age is: "+ studentAge + "\nStudent Year: "+year+
        "\nStudent Section: "+ section);
    }
    
    
    
    
}
