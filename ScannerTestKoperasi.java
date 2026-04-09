/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author Rizki
 */

import java.util.Scanner;

public class ScannerTestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota19: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.print("\nMasukkan nominal pinjaman: ");
        int pinjam = input.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        while (donny.getJumlahPinjaman() > 0) {
            System.out.print("\nMasukkan nominal angsuran: ");
            int angsur = input.nextInt();
            
            donny.angsur(angsur);
            System.out.println("Sisa pinjaman saat ini: " + donny.getJumlahPinjaman());
            
            if (donny.getJumlahPinjaman() == 0) {
                System.out.println("Selamat! Pinjaman Anda telah LUNAS.");
            }
        }

        input.close();
    }
}