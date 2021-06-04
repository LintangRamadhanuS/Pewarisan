/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author MOKLET-1
 */
public class Lingkaran extends BangunDatar{
    float r;
    
    @Override        
    float luas(){
        
        //Spasi
        {System.out.println("");}
        
        float luas = 22/7 * r * r;
        System.out.println("luas Lingkaran: " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = 22/7 * (r * 2);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
}
