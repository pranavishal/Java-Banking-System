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
 * @author Ahmed
 */
class AnotherWay2ReadFiles {

    private Scanner scan;

    public void openFile() {
        try {
            scan = new Scanner(new File("bank.Txt"));

        } catch (FileNotFoundException ex) {
            System.out.println("could not find file");
        }
    }

    public void readFile() {
        while (scan.hasNext()) {

            String a = scan.next();
            String b = scan.next();

            System.out.printf("%s %s\n", a, b);
        }

    }

    public void closeFile() {
        scan.close();
    }
}
