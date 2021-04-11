
package l7h2;


public class Person {
    
    private Address a;
    
    Person(Address a){
        this.a = a;
    }
    
    public void setAddress(Address a){
        this.a = a;
    }
    
    public void display(){
        a.display();
    }
    
}
