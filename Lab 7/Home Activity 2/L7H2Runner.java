
package l7h2;


public class L7H2Runner {

    
    public static void main(String[] args) {
        Address a = new Address("a","b","c",1);
        a.setCity("Rwp");
        a.setHouse("H12");
        a.setStreet("5");
        a.setCode(46000);
        Person p = new Person(a);
        Book b = new Book(p,"Strange","ABC");
        b.display();
    }
    
}
