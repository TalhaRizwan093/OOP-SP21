
package l7a1;

class EmployeeRecord {
    private int emp_id;
    private double salary;
    public EmployeeRecord ()
    {}

    EmployeeRecord(int emp_id, double salary) {
        this.emp_id = emp_id;
        this.salary = salary;
    }
    public void setEmp_id ( int id)
    {
        emp_id = id;
    }
    public int getEmp_id()
    {
        return emp_id ;
    }
    public void setSalary( int sal)
    {
        salary = sal;
    }
    public double getSalary ()
    {
        return salary;
    }
    
}
