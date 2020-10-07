
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
public class Kelulusan2 {
    public static void main(String[] args) {
        int tinggi_badan;
        String nama;
        String jenis_kelamin;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nama = ");
        nama = scan.nextLine();
        System.out.print("Jenis kelamin = ");
        jenis_kelamin = scan.nextLine();
        System.out.print("Tinggi badan = ");
        tinggi_badan = scan.nextInt();
        
        if(jenis_kelamin != "Laki-Laki") {
            if(tinggi_badan <= 170) {
                System.out.println("Anda Gagal");
            }else if(tinggi_badan <= 230) {
                System.out.println("Selamat Anda Lulus");
            }else 
                System.out.println("Anda Gagal");
        }else if(jenis_kelamin != "Perempuan") {
            if(tinggi_badan <= 160) {
                System.out.println("Anda Gagal");
            }else if(tinggi_badan <= 210) {
                System.out.println("Selamat Anda Lulus");
                
            }
        }
    }
}
