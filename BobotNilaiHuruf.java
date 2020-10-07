
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
public class BobotNilaiHuruf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String huruf;
        System.out.print("Masukan nilai huruf = ");
        huruf = scan.nextLine();
        
        switch(huruf) {
            case "A":
                System.out.println("Nilai angka = 4");
                break;
            case "B":
                System.out.println("Nilai angka = 3");
                break;
            case "C":
                System.out.println("Nilai angka = 2");
                break;
            case "D":
                System.out.println("Nilai angka = 1");
                break;
            case "E":
                System.out.println("Nilai angka = 0");
        }
                
    }
}
