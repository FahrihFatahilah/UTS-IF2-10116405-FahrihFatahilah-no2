/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116405.fahrihfatahilah.no2;

import java.util.Scanner;

/**
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * Deskripsi Program : Program UTS Tabungan No:2
 */
public class UTSIF210116405FahrihFatahilahNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        
        // var
        int kredit;
        
        System.out.print("===Program Penarikan Uang====\n");
        System.out.printf("Masukkan Saldo Awal : "); tabungan.Tabungan(scan.nextInt());
        System.out.printf("Jumlah uang yang diambil : "); kredit = scan.nextInt();
        System.out.printf("Saldo Anda Sekarang : %d\n",tabungan.ambilUang(kredit));
        
        
    }
    
}
