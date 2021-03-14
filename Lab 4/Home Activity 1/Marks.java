
package l4h1;


public class Marks {
    
    private int marks1;
    private int marks2;
    private int marks3;
    
    public Marks(){
        marks1 = 0;
        marks2 = 0;
        marks3 = 0;
    }
    
    public void setMarks(int m1, int m2, int m3){
        
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
        
    }
    
    public void getMarks(){
        
        System.out.println("Marks of student is: " + marks1 + "\nMarks of student 2 is: " + marks2 +"\nMarks of student 3 is: " + marks3);
           
        
    }
    
    
}
