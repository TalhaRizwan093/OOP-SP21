

package l2a3;

import javax.swing.JOptionPane;

public class L2A3Runner {

    
    public static void main(String[] args) {
        
        CarPart car1 = new CarPart();
        String x=JOptionPane.showInputDialog("What is Model Number?" );
        String y=JOptionPane.showInputDialog("What is Part Number?" );
        String z=JOptionPane.showInputDialog("What is Cost?" );
        car1.setparameter(x,y,z);
        car1.display();
        
    }
    
}
