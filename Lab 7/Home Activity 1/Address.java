
package l7h1;


public class Address {
    
    private String street;
    private String house;
    private String city;
    private int code;
    
    Address(String street, String house, String city, int code){
        this.street = street;
        this.house = house;
        this.code = code;
        this.city = city;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    public void setHouse(String house){
        this.house = house;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setCode(int code){
        this.code = code;
    }
    
    public String getStreet(){
        return street;
    }
    
    public String getHouse(){
        return house;
    }
    
    public String getCity(){
        return street;
    }
    
    public int getCode(){
        return code;
    }
    
    public void Display(){
        System.out.println("Street: "+ street+ " house:" + house+ " city:" + city + " Code:" + code);
    }
    
    
}
