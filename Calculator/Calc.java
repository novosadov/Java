import java.awt.Image;

import javax.swing.JFrame;
 
class Calc {
    public static void main(String args[]){
    	
        Conf conf = new Conf("Калькулятор");
        conf.setVisible(true);
        conf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        conf.setSize(250, 200);
        conf.setResizable(false);
        conf.setLocationRelativeTo(null);
        conf.t1.setEditable(false);
        conf.t1.setText("0");
       
    }
}
