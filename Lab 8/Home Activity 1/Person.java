
package l8h1;


public class Person {
    
    protected String name;
    protected String address;
    protected String email;

    public Person() {
        
        name = "";
        address = "";
        email = "";
        
    }

    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
    
    public void display(){
        System.out.println("Name: "+ name + " Adress: " + address + " Email: " + email);
    }
    
    
    
}
