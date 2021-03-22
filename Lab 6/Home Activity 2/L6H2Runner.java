
package l6h2;


public class L6H2Runner {

    
    public static void main(String[] args) {
       
        NoOfObjects o1 = new NoOfObjects();
        NoOfObjects o2 = new NoOfObjects();
        NoOfObjects o3 = new NoOfObjects();
        System.out.println("Objects :" + NoOfObjects.getObj());
        NoOfObjects.destruct(o3);
        System.out.println("Objects :" + NoOfObjects.getObj());
    }
    
}
