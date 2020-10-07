
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
public class NilaiHuruf {
    public static void main(String[] args) {
        int nilai;
        Scanner scan = new Scanner(System.in);
         
        System.out.print("Masukan nilai = ");
        nilai = scan.nextInt();
        
        if(nilai <= 55) {
            System.out.println("NIlai Anda E");
        } else if(nilai <= 65) {
            System.out.println("NIlai Anda D");
        } else if (nilai <= 75) {
            System.out.println("Nilai Anda C");
        } else if (nilai <= 85) {
            System.out.println("Nilai Anda B");
        } else if (nilai <= 100) {
            System.out.println("Nilai Anda A");
        } else if (nilai < 0) {
            System.out.println("ERROR");
        } else if (nilai > 100) {
            System.out.println("ERROR");
        }
    }
}
