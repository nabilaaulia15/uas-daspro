import java.io.BufferedReader;

import java.io.InputStreamReader;


import controller.Controllers;


public class App {

    public static void main(String[] args) throws Exception {
        Controllers controller = new Controllers();
        controller.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (lanjut) {
            tampilkanMenu();
            System.out.print(" Pilih menu:");
            String pilihan = reader.readLine();
            System.out.println("");
            switch (pilihan) {
                case "1":
                    controller.lihatDaftarKereta();
                    break;
                case "2":
                    controller.belanja();
                    break;
                case "3":
                    controller.tampilkanLaporanPenjualan();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }

        System.out.println(" Sampai Jumpa");

    }

    public static void tampilkanMenu() {
        System.out.println(" ╔═════════════════════════════════╗");
        System.out.println(" ║     PIlih Menu Dibawah Ini      ║");
        System.out.println(" ║ 1. Jadwal Pemberangkatan Kereta ║");
        System.out.println(" ║ 2. Pesan Tiket                  ║");
        System.out.println(" ║ 3. Laporan Pemesanan            ║");
        System.out.println(" ║ 4. Keluar                       ║");
        System.out.println(" ╚═════════════════════════════════╝");
    }
}