/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201016;

import java.util.Stack;

public class stackjava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push (menambahkan elemen)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Isi stack: " + stack);

        // Pop (menghapus elemen terakhir)
        int removed = stack.pop();
        System.out.println("Elemen yang di-pop: " + removed);
        System.out.println("Isi stack setelah pop: " + stack);

        // Peek (melihat elemen teratas)
        int top = stack.peek();
        System.out.println("Elemen teratas: " + top);

        // Mengecek apakah stack kosong
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
    }
}
