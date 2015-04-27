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
public class Mensch extends Saeugetier {

    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
 public String printAll() {
     return name + "#" + alter + "#" + geschlecht;
 }
    
}

