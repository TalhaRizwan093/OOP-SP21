
package l7h1;


public class L7H1Runner {

    
    public static void main(String[] args) {
        Address a = new Address("a","b","c",1);
        Person p = new Person(a);
        p.getAddress();
    }
    
}
