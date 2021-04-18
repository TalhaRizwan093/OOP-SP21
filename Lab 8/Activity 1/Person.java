
package l8a1;


public class Person {
    
    protected String name ; 
    protected String id ;
    protected int phone ;
    public Person() {
        name = "NaginaNazar" ;
        id = "sp14bcs039" ;
        phone = 12345 ;
    }
    public Person(String a , String b , int c) {
        name = a ;
        id = b ;
        phone = c ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPhone() {
        return phone;
    }
    
    public void display( ) {
        System.out.println("Name : " + name + "ID : " + id + "Phone : " + phone ) ;
}

    
}
