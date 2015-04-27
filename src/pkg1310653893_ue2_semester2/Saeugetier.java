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
abstract class Saeugetier {
    String name;
    int alter;
    String geschlecht;
    
    public Saeugetier (String name, int alter, String geschlecht) {
        
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
}
    public String printAll() {
        return name + "#" + alter + "#" + geschlecht;
    }
    
    public Saeugetier() {
        
    }
}
