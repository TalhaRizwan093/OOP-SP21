
package l7a1;


class Manager {
    
    private String title;
    private double dues;
    private EmployeeRecord emp;
    private StudentRecord stu;
    Manager(String t,double d,EmployeeRecord e,StudentRecord s)
    {
        title = t;
        dues = d;
        emp = e;
        stu = s; }

    void display() {
        System.out.println("Title is : " + title);
        System.out.println("Dues are : " + dues);
        System.out.println("Emplyoyee record is as under:" );
        System.out.println("EmployeeId is : " + emp.getEmp_id());
        System.out.println("EmployeeId is : " + emp.getSalary());
        System.out.println("Student record is as under:" );
        System.out.println("Degree is : " + stu.getDegree());

    }
    
}
