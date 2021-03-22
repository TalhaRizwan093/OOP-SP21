
package l6h2;


public class NoOfObjects {
    
    private static int noOfObj;
    
    NoOfObjects(){
        noOfObj++;
    }
    
    public static int getObj(){
        return noOfObj;
    }
    
    public static void destruct(NoOfObjects o){
        o = null;
        noOfObj--;
    }
    
}
