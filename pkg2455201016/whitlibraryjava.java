/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201016;
import java.util.Stack;

public class whitlibraryjava {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        String currentText = "";

        // Tambah teks pertama
        history.push(currentText);
        currentText += "Halo ";
        System.out.println("Teks saat ini: " + currentText);

        // Tambah teks kedua
        history.push(currentText);
        currentText += "Dunia!";
        System.out.println("Teks saat ini: " + currentText);

        // Undo sekali
        if (!history.isEmpty()) {
            currentText = history.pop();
        }
        System.out.println("Setelah Undo: " + currentText);

        // Undo lagi
        if (!history.isEmpty()) {
            currentText = history.pop();
        }
        System.out.println("Setelah Undo kedua: " + currentText);
    }
}


