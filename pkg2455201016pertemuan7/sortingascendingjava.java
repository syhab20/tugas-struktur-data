/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201016pertemuan7;
public class sortingascendingjava {
    public static void main(String[] args) {
        int[] data = {45, 12, 78, 34, 23};

        System.out.println("Data sebelum sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }

        // Bubble Sort Ascending
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        System.out.println("\nData setelah sorting (Ascending):");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}

