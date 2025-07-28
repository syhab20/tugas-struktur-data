/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201016;
import java.util.Stack;

public class studikasusjava {
    public static void main(String[] args) {
        Stack<String> transaksi = new Stack<>();

        // Tambah transaksi (push)
        transaksi.push("Setor 50.000");
        transaksi.push("Tarik 20.000");
        transaksi.push("Setor 100.000");

        // Tampilkan semua transaksi
        System.out.println("Riwayat transaksi: " + transaksi);

        // Lihat transaksi terakhir (peek)
        System.out.println("Transaksi terakhir: " + transaksi.peek());

        // Batalkan transaksi terakhir (pop)
        System.out.println("Transaksi dibatalkan: " + transaksi.pop());

        // Lihat transaksi setelah pop
        System.out.println("Riwayat setelah pembatalan: " + transaksi);

        // Cek apakah stack kosong
        System.out.println("Apakah riwayat kosong? " + transaksi.isEmpty());
    }
}
