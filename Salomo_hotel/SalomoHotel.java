package Salomo_hotel;


import Menu_utama.pemesanan;
import Layanan_hotel.Admin;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalomoHotel {
    static List<pemesanan> riwayatPemesanan = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin kamarService = new Admin();

        while (true) {
            System.out.print("Selamat Datang di Salomo Hotel\nNama: ");
            String nama = scanner.nextLine();
            System.out.print("Halo " + nama + ", ada yang bisa dibantu? (Y/N): ");
            String bantuan = scanner.nextLine().toUpperCase();

            if (bantuan.equals("N")) {
                System.out.println("Terima kasih sudah berkunjung ke Salomo Hotel.");
                break;
            }

            System.out.println("Anda masuk sebagai?\n1. User\n2. Admin");
            int peran = scanner.nextInt();
            scanner.nextLine(); 

            if (peran == 2) {
                kamarService.ubahKetersediaanKamar(scanner);
                continue; 
            }

            while (true) {
                System.out.println("Pilih opsi:\n1. Pesan Kamar\n2. Cek Ketersediaan Kamar\n3. Lihat Detail Pesanan\n4. Keluar");
                int opsi = scanner.nextInt();
                scanner.nextLine(); 

                if (opsi == 1) {
                    System.out.println("Pilih jenis kamar:\n1. Superior (Rp 1.500.000)\n2. Deluxe (Rp 1.000.000)\n3. Suite (Rp 500.000)");
                    int pilihanKamar = scanner.nextInt();
                    int hargaKamar = pilihanKamar == 1 ? 1500000 : pilihanKamar == 2 ? 1000000 : 500000;

                    System.out.print("Lama Menginap (malam): ");
                    int lamaMenginap = scanner.nextInt();
                    scanner.nextLine(); 

                    riwayatPemesanan.add(new pemesanan(
                            pilihanKamar == 1 ? "Superior" : pilihanKamar == 2 ? "Deluxe" : "Suite",
                            hargaKamar,
                            lamaMenginap
                    ));
                    System.out.println("Pemesanan berhasil!");

                } else if (opsi == 2) {
                    kamarService.tampilkanKetersediaanKamar();

                } else if (opsi == 3) {
                    if (riwayatPemesanan.isEmpty()) {
                        System.out.println("Belum ada pemesanan.");
                    } else {
                        for (pemesanan p : riwayatPemesanan) {
                            System.out.println(p);
                        }
                    }

                } else if (opsi == 4) {
                    System.out.println("Terima kasih telah menggunakan Salomo Hotel.");
                    break;

                } else {
                    System.out.println("Opsi tidak valid.");
                }
            }
        }
    }
}

