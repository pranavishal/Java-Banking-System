/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 *
 * @author Ahmed
 */
public class TestRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        AnotherWay2ReadFiles t = new AnotherWay2ReadFiles();
        t.openFile();
        t.readFile();
        t.closeFile();
    }

}
