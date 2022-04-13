/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2.newpackage;

/**
 *
 * @author Fafa
 */
public class TestBola {
    public static void main(String[] args) {
        double Jarijari = 14;
        Bola bola1 = new Bola(7);
        bola1.showDiameter();
        bola1.showLuasPermukaan();
        bola1.showVolume();
        System.out.println("\n");
        
        bola1.setJarijari(Jarijari);
        bola1.showDiameter();
        bola1.showLuasPermukaan();
        bola1.showVolume();
    }
}
