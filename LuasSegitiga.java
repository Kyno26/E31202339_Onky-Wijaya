
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        System.out.println("Menghitung Luas Segitiga");
        int bil1 = 0;
        int bil2 = 0;
        try {
            System.out.println("Masukan Alas = ");
            bil1 = Integer.parseInt(dataIn.readLine());
            System.out.println("Masukan Tinggi = ");
            bil2 = Integer.parseInt(dataIn.readLine());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        int hasil = (int) (0.5 * bil1 * bil2);
        System.out.println("Luas Segitiga = "+ hasil);
    }
}
