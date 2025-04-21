/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author x260
 */
public class pbobangundatar {
    public static void main(String[] args) {
        masterpbobangundatar Lingkaran = new masterpbobangundatar ();
        Lingkaran.luaslingkaran = Lingkaran.phi*Lingkaran.jarijari*Lingkaran.jarijari;
        System.out.println("Luas Lingkaran dari jari jari : " + Lingkaran.jarijari+ " Adalah " + Lingkaran.luaslingkaran);
        
       masterpbobangundatar persegipanjang= new masterpbobangundatar();
       persegipanjang.luas= persegipanjang.panjang*persegipanjang.lebar;
        System.out.println("Luas persegipanjang : " + persegipanjang.luas);
               
    }
}