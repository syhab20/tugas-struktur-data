public class pboplayer {
    String nama;
    int level;
    int hp;

    public pboplayer(String nama, int level, int hp) {
        this.nama = nama;
        this.level = level;
        this.hp = hp;
    }

    public void serang() {
        System.out.println(nama + " menyerang musuh!");
    }

    public void tampilkanStatus() {
        System.out.println("Nama Player: " + nama);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
    }

    public static void main(String[] args) {
        pboplayer player = new pboplayer("udin", 10, 100);
        player.serang();
        player.tampilkanStatus();
    }
}