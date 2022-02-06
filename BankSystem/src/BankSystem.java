
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
User ID: Minimum 8 characters
         lower case allowed, uppercase allowed, ".", and "_" allowed Remaining special characters not allowed
         max of than 16 characters
 */
/**
 *
 * @author Ron Vishal
 */
public class BankSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a new main page
        MainPage mgf = new MainPage();
        //set it visible
        mgf.setVisible(true);
        //make the dimensions based off the desgin layout
        mgf.pack();
        //center the frame
        mgf.setLocationRelativeTo(null);
        //close the application when the window closes
        mgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
