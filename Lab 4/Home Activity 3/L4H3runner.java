
package l4h3;


public class L4H3runner {

    
    public static void main(String[] args) {
        
        Student s1 = new Student("Talha",new int[] {1,2,3,4,5});
        Student s2 = new Student("Ali",new int[] {1,2,3,4,6});
        Student s3 = new Student("Talha",new int[] {1,2,3,4,6});
        
        double avg1,avg2;
        avg1 = s1.average();
        avg2 = s2.average();
        
        if(avg1 > avg2){
            System.out.println("Student 1 has higher average ");
        }
        else
            System.out.println("Student 2 has higher average ");
        
        
        
    }
    
}
