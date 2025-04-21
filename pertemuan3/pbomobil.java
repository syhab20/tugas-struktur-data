public class pbomobil {
    String merk;
    String warna;
    int kecepatan;

    public pbomobil(String merk, String warna, int kecepatan) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin mobil " + merk + " dinyalakan.");
    }

    public void tampilkanInfo() {
        System.out.println("Mobil Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Maksimal: " + kecepatan + " km/h");
    }

    public static void main(String[] args) {
        pbomobil mobil = new pbomobil("Toyota", "Hitam", 180);
        mobil.nyalakanMesin();
        mobil.tampilkanInfo();
    }
}