package Menu_utama;

import java.util.Scanner;

public class pemesanan {
    public String jenisKamar;
    public int hargaKamar;
    public int lamaMenginap;

    public pemesanan(String jenisKamar, int hargaKamar, int lamaMenginap) {
        this.jenisKamar = jenisKamar;
        this.hargaKamar = hargaKamar;
        this.lamaMenginap = lamaMenginap;
    }

    
    public String toString() {
        return "Jenis Kamar: " + jenisKamar + ", Harga per Malam: Rp " + hargaKamar + ", Lama Menginap: " + lamaMenginap + " malam, Total Biaya: Rp " + (hargaKamar * lamaMenginap);
    }
}
