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
public class Persegi extends BangunDatar{
    float sisi;
    
    @Override        
    float luas(){
        
        //Spasi
        {System.out.println("");}
        
        float luas = sisi * sisi;
        System.out.println("luas Persegi: " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
    
}
