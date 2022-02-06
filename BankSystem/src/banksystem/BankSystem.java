/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ron Vishal
 */
public class BankSystem {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        // lol
        File data = new File("bankCheck.Txt");
        Scanner dataScan = new Scanner(data);
        while (dataScan.hasNextLine()) {
            System.out.println(dataScan.nextLine());
        }

    }

}
