
package l7h1;


public class Person {
    
    private Address a;
    
    Person(Address a){
        this.a = a;
    }
    
    public void setAddress(Address a){
        this.a = a;
    }
    
    public void getAddress(){
        a.Display();
    }
    
}
