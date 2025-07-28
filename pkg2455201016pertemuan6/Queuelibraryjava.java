/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201016pertemuan6;
import java.util.LinkedList;
import java.util.Queue;

public class Queuelibraryjava {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Menambahkan elemen (Enqueue)
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Isi queue: " + queue);

        // Menghapus elemen (Dequeue)
        System.out.println("Elemen yang dihapus: " + queue.poll());
        System.out.println("Isi queue setelah dequeue: " + queue);

        // Melihat elemen terdepan
        System.out.println("Elemen terdepan: " + queue.peek());

        // Mengecek apakah queue kosong
        System.out.println("Apakah queue kosong? " + queue.isEmpty());
    }
}

