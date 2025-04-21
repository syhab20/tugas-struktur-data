public class perulanganwhile {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("Perulangan ke-" + i);
            i++; // jangan lupa ini, biar gak infinite loop!
        }
    }
}
