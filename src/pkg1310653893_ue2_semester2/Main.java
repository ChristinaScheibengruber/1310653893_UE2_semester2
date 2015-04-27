/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1310653893_ue2_semester2;

/**
 *
 * @author Chrissi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mensch andrea = new Mensch("Andrea", 48, "weiblich");
    Mensch2 christina = new Mensch2 ("christina", "scheibengruber", 21);
    Student christinaScheibengruber = new Student (1310653893, "Web Business & Technology", "christina", "scheibengruber", 21);
    
    christina.status();
    christinaScheibengruber.status();
    
    

        System.out.println(andrea.printAll());
    }
    
}
