
package l7a2;


class Employee {
    
    private String name;
    private String fname;
    private Date birthDate;
    private Date hireDate;
    
    Employee(){}
    Employee(String x, String y, Date birthofDate, Date dateofHire)
    {
        name=x;
        fname=y;
        birthDate=birthofDate;
        hireDate=dateofHire;
 
    }
    public void setname(String x)
    {
        name=x;
    }
    public String getname()
    {
        return name;
 
    }
    public void setfname(String x)
    {
        fname=x;
    }
    public String getfname()
    {
        return fname;
    }
 
 
    public void setbirthdate(Date b)
     {
        birthDate= b;
 
    }
    public Date getbirthdate()
     {
        return birthDate;
 
    }
    public void sethiredate(Date h)
    {
        hireDate = h;
    } 
    public Date gethiredate()
    {
        return hireDate;
    } 
    
    public void display()
    {
 
        System.out.println("Name: "+ name +" Father Name: "+ fname );
        birthDate.display();
        hireDate.display(); 
 
 }


    
}
