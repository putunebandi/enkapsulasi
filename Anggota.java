/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author Rizki
 */
public class Anggota {
    private String nomorKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    private int pinjamanAwal;

    public Anggota(String nomorKtp, String nama, int limitPinjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
        this.pinjamanAwal = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if (nominal > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
            pinjamanAwal = jumlahPinjaman;
        }
    }

    public void angsur(int nominal) {
        double minAngsuran = pinjamanAwal * 0.1;

        if (nominal < minAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman awal");
        } else {
            jumlahPinjaman -= nominal;
            
            if (jumlahPinjaman <= 0) {
                jumlahPinjaman = 0;
                pinjamanAwal = 0;
            }
        }
    }
}