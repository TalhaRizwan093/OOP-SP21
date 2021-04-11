
package l7a1;


public class L7A1Runner {

    
    public static void main(String[] args) {
        StudentRecord s = new StudentRecord("MBA");
        EmployeeRecord e = new EmployeeRecord(111, 50000);
        Manager m1 = new Manager("financeManager" , 5000, e, s ) ;
        m1.display();

    }
    
}
