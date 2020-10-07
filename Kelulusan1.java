
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Kelulusan1 {
    public static void main(String[] args) {
        // Buat Scanner
        Scanner inp = new Scanner(System.in);
        
        // Ambil Nama
        System.out.print("Masukan nama anda = ");
        String nama = inp.nextLine();
        
        // Ambil NIM
        System.out.print("Masukan NIM = ");
        String nim = inp.nextLine();
        
        // Ambil Nilai
        System.out.print("Masukan nilai = ");
        int nilai = inp.nextInt();
        
        // Print
        if(nilai > 55) {
            System.out.println("Anda lulus");
        }else{
            System.out.println("Anda tidak lulus");
        }        
        
    }
}
