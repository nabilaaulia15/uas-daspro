

package controller;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Kereta;
import model.DetilPenjualan;
import model.Pembeli;
import model.Stasiun;
import model.Penjualan;

public class Controllers {
    HashMap<String, Kereta> keretas = new HashMap<>();
    ArrayList<Penjualan> penjualans = new ArrayList<>();
    HashMap<String, Pembeli> Pembelis = new HashMap<>();
    HashMap<String, Stasiun> Stasiuns = new HashMap<>();
    

    public void setUp() {
        Kereta barang1 = new Kereta();
        Kereta barang2 = new Kereta();
        Kereta barang3 = new Kereta();
        Kereta barang4 = new Kereta();
        barang1.setIdKereta("#01").setNamKereta("Bandung-Jakarta").setHargaKereta(90000).setIsAvailable(true);
        barang2.setIdKereta("#02").setNamKereta("Bandung-Yogyakarta").setHargaKereta(180000).setIsAvailable(true);
        barang3.setIdKereta("#03").setNamKereta("Bandung-Surabaya").setHargaKereta(250000).setIsAvailable(true);
        barang4.setIdKereta("#04").setNamKereta("Bandung-Bali").setHargaKereta(400000).setIsAvailable(false);

        keretas.put(barang1.getIdKereta(), barang1);
        keretas.put(barang2.getIdKereta(), barang2);
        keretas.put(barang3.getIdKereta(), barang3);
        keretas.put(barang4.getIdKereta(), barang4);

        Stasiun Stasiun1 = new Stasiun();
        Stasiun Stasiun2 = new Stasiun();
        Stasiun Stasiun3 = new Stasiun();
        
        Stasiun1.setidStasiun("Bandung").setNamaStasiun("Stasiun Bandung");
        Stasiun2.setidStasiun("Kiaracondong").setNamaStasiun("Stasiun Kiaracondong");
        Stasiun3.setidStasiun("Kosambi").setNamaStasiun("Stasiun Kosambi");
        
        Stasiuns.put(Stasiun1.getidStasiun(), Stasiun1);
        Stasiuns.put(Stasiun2.getidStasiun(), Stasiun2);
        Stasiuns.put(Stasiun3.getidStasiun(), Stasiun3);

        Pembeli Pembeli1 = new Pembeli();
        Pembeli Pembeli2 = new Pembeli();
        Pembeli Pembeli3 = new Pembeli();
        
        Pembeli1.setuserName("Irsyad ").setNamaPembeli("Irsyad Adfiansha Hidayat").setKtp("0123456789").setEmail("Irsyad@gmail.com");
        Pembeli2.setuserName("Jordan ").setNamaPembeli(" Jordan Marcelino").setKtp("0234567891").setEmail("Jordan@gmail.com");
        Pembeli3.setuserName("Nabila ").setNamaPembeli("Nabila Aulia").setKtp("0345678912").setEmail("Nabila@gmail.com");
        
        Pembelis.put(Pembeli1.getuserName(), Pembeli1);
        Pembelis.put(Pembeli2.getuserName(), Pembeli2);
        Pembelis.put(Pembeli3.getuserName(), Pembeli3);

    }

    public void lihatDaftarKereta() {
        System.out.println();
        System.out.println("==== Daftar Pemberangkatan Kereta ====");
        for (Map.Entry<String, Kereta> barang : keretas.entrySet()) {
            String key = barang.getKey();
            Kereta tKereta = barang.getValue();
            if (tKereta.isIsAvailable()) {
                System.out.println("Kode Tiket \t :" + key);
                System.out.println("Tujuan \t\t :" + tKereta.getNamaKereta());
                System.out.println("Harga \t\t :" + tKereta.getHargaKereta());
                System.out.println();
            }

        }
    }

    public Kereta getKereta(String idKereta) {
        return keretas.get(idKereta);
    }

    public Stasiun getStasiun(String idStasiun) {
        return Stasiuns.get(idStasiun);
    }

    public Pembeli getPembeli(String userName) {
        return Pembelis.get(userName);
    }

    public void belanja() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DetilPenjualan> tDetilPenjualans = new ArrayList<>();
        int increment = 0;
        String lanjut = "";
        try {
            do {
                increment++;
                System.out.println();
System.out.println("╔══════════════════════════════════════════╗");
System.out.print("║ Masukkan Username Anda \t: ");
String username = input.readLine();
System.out.print("║ Pemesanan Pergi Dari Stasiun \t: ");
String asalStasiun = input.readLine();
System.out.print("║ Silahkan masukkan kode Tiket\t: ");
String kodeKereta = input.readLine();
System.out.print("║ Jumlah yang akan dibeli\t: ");
int jumlah = Integer.valueOf(input.readLine());
System.out.print("║ Kembali berbelanja (Y/N)?\t: ");
lanjut = input.readLine();
System.out.println("╚══════════════════════════════════════════╝");


                DetilPenjualan dp = new DetilPenjualan();
                Stasiun tStasiun= getStasiun(asalStasiun);
                Pembeli tpembeli = getPembeli(username);
                Kereta tKereta = getKereta(kodeKereta);
                dp.setIdDetilPenjualan("dp" + increment);
                dp.setKereta(tKereta);
                dp.setStasiun(tStasiun);
                dp.setPembeli(tpembeli);
                dp.setHargaJual(tKereta.getHargaKereta());
                dp.setJumlahBeli(jumlah);
                dp.setSubTotal(tKereta.getHargaKereta() * jumlah);
                tDetilPenjualans.add(dp);

            } while (lanjut.equalsIgnoreCase("Y"));

            System.out.println("");
System.out.println("╔══════════════════════════════════════════╗");
System.out.println("║ === Berikut Daftar Pemesanan Anda ===");
tampilkanDaftarBelanjaan(tDetilPenjualans);
System.out.println("║ TOTAL: " + hitungTotalBelanja(tDetilPenjualans));
System.out.println("╚══════════════════════════════════════════╝");

BufferedReader inputKonfirmasi = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Konfirmasi pembelian (Y/N)?");

            String konfirm = "n";
            konfirm = inputKonfirmasi.readLine();
            if (konfirm.equalsIgnoreCase("y")) {
                Penjualan penjualan = new Penjualan();
                penjualan.setDetilPenjualans(tDetilPenjualans).setIdPenjualan("P" + penjualans.size() + 1).setTanggal(LocalDate.now()).setTotal(hitungTotalBelanja(tDetilPenjualans));
                penjualans.add(penjualan);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tampilkanDaftarBelanjaan(ArrayList<DetilPenjualan> dp) {
        for (DetilPenjualan detilPenjualan : dp) {
            
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║ Tujuan    : " + detilPenjualan.getKereta().getNamaKereta());
        System.out.println("║ Stasiun   : " + detilPenjualan.getStasiun().getNamaStasiun());
        System.out.println("║ Harga     : " + detilPenjualan.getHargaJual());
        System.out.println("║ Jumlah    : " + detilPenjualan.getJumlahBeli());
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("");
        }
    }

    public int hitungTotalBelanja(ArrayList<DetilPenjualan> dp) {
        int total = 0;
        for (DetilPenjualan detilPenjualan : dp) {
            total += detilPenjualan.getSubTotal();
        }
        return total;
    }

    public void tampilkanLaporanPenjualan() {
        for (Penjualan penjualan : penjualans) {
            System.err.println();
            System.err.println("╔══════════════════════════════════════════╗");
System.out.println("║ Kode Penjualan       : " + penjualan.getIdPenjualan());
System.out.println("║ Tanggal transaksi    : " + penjualan.getTanggal());
System.out.println("║                       " + "=".repeat(20));
System.err.println("╚══════════════════════════════════════════╝");

            ArrayList<DetilPenjualan> detilPenjualans = penjualan.getDetilPenjualans();
            for (DetilPenjualan dp : detilPenjualans) {
                System.out.println("╔══════════════════════════════════════════╗");
                System.out.println("║ Tujuan            : " + dp.getKereta().getNamaKereta());
                System.out.println("║ Jumlah beli       : " + dp.getJumlahBeli());
                System.out.println("║ Subtotal          : " + dp.getSubTotal());
                System.out.println("╚══════════════════════════════════════════╝");
                
                System.out.println("=========================");
                System.out.println("Total              : " + penjualan.getTotal());
                
        }
    }
}
}
