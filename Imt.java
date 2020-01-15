/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imt;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Imt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        float tinggi, berat, hasil;
        System.out.print("Masukkan Tinggi Badan (m)  = ");
        tinggi = masukan.nextFloat();
        System.out.print("Masukkan Berat Badan (kg)  = ");
        berat = masukan.nextFloat();
        hasil = berat / (tinggi*tinggi);
        if (hasil <= 18.5f )
            System.out.println("Kurus");
        else if ((18.5f < hasil) && (hasil <= 25))
            System.out.println("Normal");
        else if ((25 < hasil) && (hasil <= 30))
            System.out.println("Gemuk");
        else 
            System.out.println("Obesitas");
    }
  
    }
    
