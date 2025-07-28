/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201016pertemuan6;
class Queue {
    private int maxSize;
    private String[] data;
    private int front, rear, count;

    public Queue(int size) {
        maxSize = size;
        data = new String[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Tambah nasabah (enqueue)
    public void enqueue(String nama) {
        if (isFull()) {
            System.out.println("Antrian penuh! " + nama + " tidak bisa masuk.");
        } else {
            rear = (rear + 1) % maxSize;
            data[rear] = nama;
            count++;
            System.out.println(nama + " masuk ke antrian.");
        }
    }

    // Layani nasabah (dequeue)
    public String dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            String nama = data[front];
            front = (front + 1) % maxSize;
            count--;
            return nama;
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Antrian: ");
            for (int i = 0; i < count; i++) {
                System.out.print(data[(front + i) % maxSize] + " ");
            }
            System.out.println();
        }
    }
}

public class Queuemanualjava{
    public static void main(String[] args) {
        Queue antrian = new Queue(5);

        // Tambah nasabah otomatis
        antrian.enqueue("Andi");
        antrian.enqueue("Budi");
        antrian.enqueue("Citra");
        antrian.enqueue("Dedi");

        // Tampilkan antrian
        antrian.display();

        // Layani 2 nasabah
        System.out.println("Melayani nasabah: " + antrian.dequeue());
        System.out.println("Melayani nasabah: " + antrian.dequeue());

        // Tampilkan antrian setelah dilayani
        antrian.display();

        // Tambah nasabah baru
        antrian.enqueue("Eka");
        antrian.enqueue("Fani"); // antrian penuh jika lebih dari kapasitas

        // Tampilkan antrian akhir
        antrian.display();
    }
}
