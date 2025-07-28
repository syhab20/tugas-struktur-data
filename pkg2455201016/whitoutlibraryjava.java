/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201016;
public class whitoutlibraryjava {
    int[] stack = new int[5];
    int top = -1;

    void push(int val) {
        if (top < 4) stack[++top] = val;
    }

    int pop() {
        return (top >= 0) ? stack[top--] : -1;
    }

    int peek() {
        return (top >= 0) ? stack[top] : -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        whitoutlibraryjava s = new whitoutlibraryjava();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Top: " + s.peek());
        System.out.println("Pop: " + s.pop());
        System.out.println("Is empty? " + s.isEmpty());
    }
}
