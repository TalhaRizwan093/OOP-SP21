
package l6asi;

import java.util.Scanner;


public class L6AsiRunner {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1;
        double n2;
        System.out.println("Enter first number:");
        n1 = scan.nextInt();
        System.out.println("Enter first number:");
        n2 = scan.nextInt();
        
        
        System.out.println("Sum is:"+ Calculator.sum(n1, n2));
        System.out.println("Multiplication is:"+ Calculator.multiply(n1, n2));
        System.out.println("Division is:"+ Calculator.divide(n1, n2));
        System.out.println("Modulus is:"+ Calculator.modulus(n1, n2));
        System.out.println("Sin of number n1:"+ Calculator.sin(n1));
        System.out.println("Cos of number n1:"+ Calculator.cos(n1));
        System.out.println("tan of number n1:"+ Calculator.tan(n1));
        System.out.println("Sin of number n2:"+ Calculator.sin(n2));
        System.out.println("Cos of number n2:"+ Calculator.cos(n2));
        System.out.println("tan of number n2:"+ Calculator.tan(n2));
    }
    
}
