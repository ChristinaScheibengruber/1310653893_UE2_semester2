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
public class Mensch2 {
    String vorname;
    String nachname;
    int alter;

    public Mensch2(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    
    void status() {
        System.out.println("Es handelt sich um einen Menschen " + vorname + nachname + alter);
    }

    public Mensch2() {
    }
    
    
}
