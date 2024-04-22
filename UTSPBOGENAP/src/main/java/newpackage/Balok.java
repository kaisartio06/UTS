package newpackage;

public class Balok {

    // properti atau atribut
    private int panjang;
    private int lebar;
    private int tinggi;

    // Konstruktor tanpa parameter, 
    // berfungsi untuk menginisialisasi nilai properti secara default
    public Balok() {
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
    }

    // Konstruktor dengan parameter
    // berfungsi untuk menginisialisasi nilai properti sesuai dengan nilai yang diberikan
    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }

    // method untuk menghitung luas permukaan balok
    public int getLuas() {
        return 2 * ((this.panjang * this.lebar) + (this.panjang * this.tinggi) + (this.lebar * this.tinggi));
    }

    // method untuk menghitung keliling balok
    public int getKeliling() {
        return 4 * (this.panjang + this.lebar + this.tinggi);
    }

    // method untuk menghitung volume balok
    public int getVolume() {
        return this.panjang * this.lebar * this.tinggi;
    }

    // getter untuk properti panjang
    public int getPanjang() {
        return this.panjang;
    }

    // getter untuk properti lebar
    public int getLebar() {
        return this.lebar;
    }

    // getter untuk properti tinggi
    public int getTinggi() {
        return this.tinggi;
}
}
