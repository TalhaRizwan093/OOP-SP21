
package l8h1;


public class L8H1Runner {

    public static void main(String[] args) {
        Faculty f = new Faculty(1,"a","b",2,"d","e","f");
        Student s = new Student("regular","a","b","c");
        Staff st = new Staff("a","b",1,"d","e","f");
        System.out.println("Student");
        s.display();
        System.out.println("Faculty");
        f.display();
        System.out.println("Staff");
        st.display();
        
        
    }
    
}
