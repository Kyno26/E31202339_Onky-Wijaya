
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
public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka = ");
            int angka = input.nextInt();
        if(angka % 2 == 0){
            System.out.println("Angka " + angka + " adalah bilangan genap");
        }else{
            System.out.println("Angka " + angka + " adalah bilangan ganjil");
        }
    }
}
