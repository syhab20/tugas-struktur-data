import java.util.Scanner;

       
public class percabanganswitchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih menu:");
        System.out.println("1. saate");
        System.out.println("2. bakso");
        System.out.println("3. soto");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih Makan.");
                break;
            case 2:
                System.out.println("Kamu memilih Minum.");
                break;
            case 3:
                System.out.println("Keluar dari program.");
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
        }
    }
}
