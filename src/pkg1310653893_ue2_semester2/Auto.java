/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1310653893_ue2_semester2;

import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;

/**
 *
 * @author Chrissi
 */
public class Auto extends Fahrzeug{
   private boolean klimaanlage;
   private short airbags;
   
   public void klimaanlageAn() {
       this.klimaanlage = true;
       if(this.klimaanlage = false) {
           JOptionPane.showInputDialog("Klimaanlage läuft bereits");
       }
   }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
   
   public void klimaanlageAus() {
       this.klimaanlage = false;
       if(this.klimaanlage = true) {
           JOptionPane.showInputDialog("Klimaanlage bereits aus");
       }
   }
   
   public Auto (boolean klimaanlage, short airbags, short reifen, String farbe, int ps, short tueren, boolean gestartet, short geschwindigkeit) {
       super(reifen, farbe, tueren, tueren, geschwindigkeit);
       gestartet = false;
       klimaanlage = false;
       geschwindigkeit = 0;
       anzahl++;
   }

    @Override
    public String toString() {
        return "Mein Auto hat" + get(ps) + "und fährt mit " + get(geschwindigkeit); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   
}
