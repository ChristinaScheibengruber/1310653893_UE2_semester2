/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1310653893_ue2_semester2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pkg1310653893_ue2_semester2.Fahrzeug.color;

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
    Auto audi = new Auto(true, (short) 2, (short) 4, color.Black, (short) 270, (short) 4, (short) 50);
    Auto bmw = new Auto(false, (short) 4, (short) 4, color.Red, (short) 230, (short) 4, (short) 70);
    Auto audi2 = new Auto(true, (short) 2, (short) 4, color.Silver, (short) 170, (short) 4, (short) 60);
    Auto audi3 = new Auto(true, (short) 2, (short) 4, color.Red, (short) 400, (short) 4, (short) 100);
    Auto audi4 = new Auto(true, (short) 4, (short) 4, color.Black, (short) 150, (short) 4, (short) 90);
    
    audi.compareTo(bmw);
    List<Auto> liste = new ArrayList<>();
    liste.add(audi);
    liste.add(bmw);
    liste.add(audi2);
    liste.add(audi3);
    liste.add(audi4);
    Collections.sort(liste);
    
        for (Auto a : liste) {
            System.out.println(a.toString());
            
        }
    christina.status();
    christinaScheibengruber.status();
        System.out.println(andrea.printAll());
    }
    
}
