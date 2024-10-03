package Layanan_hotel;


import Menu_utama.Kamar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    private List<Kamar> kamarList;

    public Admin() {
        kamarList = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            kamarList.add(new Kamar("Superior", i));
            kamarList.add(new Kamar("Deluxe", i));
            kamarList.add(new Kamar("Suite", i));
        }
    }

    public void tampilkanKetersediaanKamar() {
        for (Kamar kamar : kamarList) {
            System.out.println(kamar);
        }
    }

    public void ubahKetersediaanKamar(Scanner scanner) {
        boolean mengupdateLagi;
    
        do {
            tampilkanKetersediaanKamar();
            System.out.print("Pilih kamar yang ingin diubah ketersediaannya (1-" + kamarList.size() + "): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
    
            if (pilihan >= 1 && pilihan <= kamarList.size()) {
                Kamar kamarDipilih = kamarList.get(pilihan - 1);
                System.out.print("Apakah kamar tersedia? (Y/N): ");
                String input = scanner.nextLine().toUpperCase();
    
                if (input.equals("Y")) {
                    kamarDipilih.tersedia = true;
                    System.out.println("Status kamar berhasil diubah menjadi tersedia.");
                } else if (input.equals("N")) {
                    kamarDipilih.tersedia = false;
                    System.out.println("Status kamar berhasil diubah menjadi tidak tersedia.");
                } else {
                    System.out.println("Input tidak valid. Status kamar tidak berubah.");
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }
    
            System.out.print("Apakah ingin mengupdate lagi? (Y/N): ");
            String updateLagi = scanner.nextLine().toUpperCase();
            mengupdateLagi = updateLagi.equals("Y");
    
        } while (mengupdateLagi);
    }
    
}    
