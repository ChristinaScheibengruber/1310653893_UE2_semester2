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
public class Student extends Mensch2 {
    int matrikelnummer;
    String Studiengang;

    public Student(int matrikelnummer, String Studiengang, String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.Studiengang = Studiengang;
    }
    
    void status() {
        System.out.println("Es handelt sich um einen Studenten " + vorname + nachname + alter);
    }
}
