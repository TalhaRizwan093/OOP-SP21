
package l8h1;

import java.util.Date;


public class Faculty extends Employee {
    
    private int officeHours;
    private String rank;

  //  public Faculty() {
 //       officeHours = 0;
  //      rank = "";
  //  }

    public Faculty(int officeHours, String rank, String office, int salary, String name, String address, String email) {
        super(office, salary, name, address, email);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }
    
    public void display(){
        super.display();
        System.out.println("Office hours: " + officeHours + " Rank: " +rank );
    }
    
    
    
    
}
