
package l8h1;

import java.util.Date;


public class Staff extends Employee {
    
    private String title;

    public Staff(String title, String office, int salary, String name, String address, String email) {
        super(office, salary, name, address, email);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public void display(){
        super.display();
        System.out.println("Title is: " + title);
    }
    
}
