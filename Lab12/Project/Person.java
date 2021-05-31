
package project;


public class Person {
    
    //Data feileds
    protected String name;
    protected int id;


    //Arrgumented constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    

    //Getter Methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    //Seter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    //toString method
    @Override
    public String toString() {
        return " Name: " + name + " ID: " + id;
    }
    
    
    
    
}
