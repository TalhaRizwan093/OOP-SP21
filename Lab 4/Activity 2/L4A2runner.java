/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4a2;

/**
 *
 * @author cui
 */
public class L4A2runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(10);
        System.out.println("Area of Rectangle is: " + rect.area( ));
        System.out.println("width of Rectangle is: " + rect.getWidth( ));

    }
    
}
