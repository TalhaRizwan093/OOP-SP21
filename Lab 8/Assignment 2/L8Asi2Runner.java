
package l8asi2;

import java.util.Scanner;


public class L8Asi2Runner {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int wordSize,memorySize,storageSize;
        double speed,length,width,height,weight;

        System.out.print("Enter Word Size(Bits): ");
        wordSize = scan.nextInt();
        System.out.print("Enter Memory Size(Megabytes): ");
        memorySize = scan.nextInt();
        System.out.print("Enter Storage Size(MegaBytes): ");
        storageSize = scan.nextInt();
        System.out.print("Enter Speed(MegaHertz): ");
        speed = scan.nextDouble();
        System.out.print("Enter Length(inch): ");
        length = scan.nextDouble();
        System.out.print("Enter Width(inch): ");
        width = scan.nextDouble();
        System.out.print("Enter Height(inch): ");
        height = scan.nextDouble();
        System.out.print("Enter Weight(Kg): ");
        weight = scan.nextDouble();
        
        Laptop l = new Laptop(length,width,height,weight,wordSize,memorySize,storageSize,speed);
        System.out.println("------Laptop Specs are-----");
        System.out.println(l.display());
        
    }
    
}
