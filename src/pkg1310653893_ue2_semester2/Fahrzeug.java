/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1310653893_ue2_semester2;

import static javax.swing.UIManager.get;

/**
 *
 * @author Chrissi
 */
public class Fahrzeug implements Comparable{
    private short reifen;
    private String farbe;
    short ps;
    private short tueren;
     boolean gestartet;
     short geschwindigkeit;
    public static int anzahl;
    
    public Fahrzeug (short reifen, String farbe, short ps, short tueren, short geschwindigkeit){
        this.reifen = reifen;
        this.farbe = farbe;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = gestartet;
        this.geschwindigkeit = geschwindigkeit;
    }
    public void starten(){
        this.gestartet = true;
    }
    
    public void stoppen(){
        this.gestartet = false;
    }
    
    public void beschleunigen(short geschwindigkeit) {
        if (gestartet = true) {
        this.geschwindigkeit+= geschwindigkeit;
            if (geschwindigkeit > 250) {
                geschwindigkeit = 250;
            }
                
        }
    }
    
    public void bremsen(short geschwindigkeit){
        if (gestartet = true) {
            this.geschwindigkeit-= geschwindigkeit;
            if (geschwindigkeit < 0) {
                geschwindigkeit = 0;
            }
            }
        }
    
    


    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }

    public short getReifen() {
        return reifen;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getPs() {
        return ps;
    }

    public short getTueren() {
        return tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    @Override
    public String toString() {
        return "Mein Auto hat " + getPs() + " und fährt mit " + getGeschwindigkeit();
    }

    @Override
    public int compareTo(Object o) {
    Fahrzeug f = (Fahrzeug) o;
    if (this.getPs() > f.getPs()) {
        return 1;
    }
    
    else if (this.getPs() < f.getPs()) {
        return -1;
    }
    
    else {
        return 0;
    }
    }



    
}
