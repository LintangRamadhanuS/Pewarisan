/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Lintang Ramadhanu Setyawan
 */
public class Main {
    public static void main(String[]args){
        BangunDatar bangunDatar = new BangunDatar();
                
        Persegi persegi = new Persegi();
        persegi.sisi = 3;
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        PersegiPanjang PersegiPanjang = new PersegiPanjang();
        PersegiPanjang.panjang = 8;
        PersegiPanjang.lebar = 2;
        
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        PersegiPanjang.luas();
        PersegiPanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
        
    }
    
}
