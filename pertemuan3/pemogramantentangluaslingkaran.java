import java.util.Scanner;

public class pemogramantentangluaslingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran (r): ");
        double r = input.nextDouble();

        // Hitung luas lingkaran
        double luas = Math.PI * r * r;

        // Tampilkan hasil
        System.out.printf("Luas lingkaran dengan jari-jari %.2f adalah %.2f\n", r, luas);
        
        input.close();
    }
}
