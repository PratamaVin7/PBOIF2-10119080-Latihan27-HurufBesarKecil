/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Huruf Besar Kecil
 */
public class PBOIF210119080Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        String hurufbesar, hurufkecil;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : "+kalimat.toUpperCase());
        System.out.println("Huruf Kecil : "+kalimat.toLowerCase());
    }
     
}