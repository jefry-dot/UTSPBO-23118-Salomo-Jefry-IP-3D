package Menu_utama;



public class Kamar {
    public String jenisKamar;
    public int nomorKamar;
    public boolean tersedia;

    public Kamar(String jenisKamar, int nomorKamar) {
        this.jenisKamar = jenisKamar;
        this.nomorKamar = nomorKamar;
        this.tersedia = true;
    }

  
    public String toString() {
        return jenisKamar + " Kamar " + nomorKamar + (tersedia ? " tersedia" : " tidak tersedia");
    }
}

