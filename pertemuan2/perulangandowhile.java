public class perulangandowhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Perulangan ke-" + i);
            i++; // jangan lupa ini, biar nggak infinite loop!
        } while (i <= 5);
    }
}

