package newpackage;

public class Main {
    public static void main(String[] args) {

        // Membuat objek balok1 dengan panjang, lebar, dan tinggi 1
        Balok balok1 = new Balok(1, 1, 1);

        // Menampilkan luas, keliling, dan volume balok1
        System.out.println("Balok dengan panjang " + balok1.getPanjang() + ", lebar " + balok1.getLebar() + " dan tinggi: " + balok1.getTinggi());
        System.out.println("Luasnya " + balok1.getLuas() + ", sedangkan");
        System.out.println("kelilingnya " + balok1.getKeliling() + " dan volumenya: " + balok1.getVolume());

        // Membuat objek balok2 dengan panjang, lebar, dan tinggi custom
        Balok balok2 = new Balok(30, 40, 50);

        // Menampilkan luas, keliling, dan volume balok2
        System.out.println("\nBalok dengan panjang " + balok2.getPanjang() + ", lebar " + balok2.getLebar() + " dan tinggi: " + balok2.getTinggi());
        System.out.println("Luasnya " + balok2.getLuas() + ", sedangkan");
        System.out.println("kelilingnya " + balok2.getKeliling() + " dan volumenya: " + balok2.getVolume());

       // Membuat objek balok3 dengan panjang, lebar, dan tinggi custom
        Balok balok3 = new Balok(25, 35, 45);

// Menampilkan luas, keliling, dan volume balok3
        System.out.println("\nBalok dengan panjang " + balok3.getPanjang() + ", lebar " + balok3.getLebar() + " dan tinggi: " + balok3.getTinggi());
        System.out.println("Luasnya " + balok3.getLuas() + ", sedangkan");
        System.out.println("kelilingnya " + balok3.getKeliling() + " dan volumenya: " + balok3.getVolume());

}
}