/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201016pertemuan6;

    import java.util.Stack;

public class Queuestudikasusjava {
    public static void main(String[] args) {
        // Queue manual (array)
        String[] queue = new String[5];
        int front = 0, rear = 0;

        // Tambah pendaftar ke antrian
        queue[rear++] = "Andi";
        queue[rear++] = "Budi";
        queue[rear++] = "Cici";

        // Tampilkan semua pendaftar
        System.out.println("Daftar pendaftar:");
        for (int i = front; i < rear; i++) {
            System.out.println("- " + queue[i]);
        }

        // Ambil nama terakhir dan balik menggunakan stack
        String terakhir = queue[rear - 1];
        Stack<Character> stack = new Stack<>();
        for (char c : terakhir.toCharArray()) {
            stack.push(c);
        }

        // Cetak nama terakhir dalam urutan terbalik
        System.out.print("\nNama terakhir dibalik: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
