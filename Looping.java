
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suisei
 */
public class Looping {
    public static void main(String[] args) {
        
        System.out.print("Masukan besar segitiga yang diinginkan (hanya angka) = ");
        Scanner scan = new Scanner(System.in);
        int jumlah = scan.nextInt();
        
        for(int a = 1; a <= jumlah; a++) {
            for(int b = 0; b < a; b++){
                System.out.print("o");
            }
            System.out.println();
        }
        for(int a = jumlah - 1; a > 0; a--){
            for(int b = 0; b < a; b++){
                System.out.print("o");
            }
            System.out.println();
        }
    }
}  