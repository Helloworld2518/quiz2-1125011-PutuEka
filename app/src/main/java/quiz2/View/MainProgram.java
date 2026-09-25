package quiz2.View;
import java.util.Scanner;
import quiz2.Util.ScannerUtil;
import quiz2.Controller.Controller;
import quiz2.Model.JenisBuah;
public abstract class MainProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Controller control = new Controller();
        boolean run = true;

        while(run){
            System.out.println("Supermarket");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Print semua Produk");
            System.out.println("keluar");
            int menu = ScannerUtil.inputInt("Masukkan Menu: ", scn);

            switch(menu){
                case 1:
                    Con
            }
        }
    }

    private static void tambahProduk(Scanner scn, ProdukController control){
        System.out.println("Pilih Jenis Produk");
        System.out.println("1. Mie");
        System.out.println("2. Buah");
        System.out.println("3. Frozen Food");
        int subMenu = ScannerUtil.inputInt("Masukkan Menu: ", scn);

        switch(subMenu){
            case 1:
                String nama = ScannerUtil.inputString("Masukkan Nama: ", scn);
                String id = ScannerUtil.inputString("Masukkan ID: ", scn);
                String rasa = ScannerUtil.inputString("Masukkan Nama: ", scn);
                double berat = ScannerUtil.inputDouble("Masukkan Berat: ", scn);
                int stok = ScannerUtil.inputInt("Masukkan Stok: ", scn);
                int harga = ScannerUtil.inputInt("Masukkan Harga: ", scn);
                Controller.addMie(id, nama, harga, stok, rasa, berat);
                break;
            case 2:
                String namaBuah = ScannerUtil.inputString("Masukkan Nama: ", scn);
                String idBuah = ScannerUtil.inputString("Masukkan ID: ", scn);
                String tanggalKadaluarsa = ScannerUtil.inputString("Masukkan Tanggal: ", scn);
                double beratBuah = ScannerUtil.inputDouble("Masukkan Berat: ", scn);
                int stokBuah = ScannerUtil.inputInt("Masukkan Stok: ", scn);
                double hargaBuah = ScannerUtil.inputDouble("Masukkan Harga: ", scn);
                int jenis = ScannerUtil.inputInt("Jenis buah: 1 = Lokal, 2 = Import", scn);
                JenisBuah JenisB = JenisBuah.IMPORT;
                if (jenis == 1){
                    JenisB = JenisBuah.LOKAL;
                }
                else{
                    JenisB = JenisBuah.IMPORT;
                }
                Controller.addbuah(idBuah, namaBuah, hargaBuah, stokBuah, JenisB, beratBuah, tanggalKadaluarsa);
                break;
            case 3:
                String namaFr = ScannerUtil.inputString("Masukkan Nama: ", scn);
                String idFr = ScannerUtil.inputString("Masukkan ID: ", scn);
                String tanggalKadaluarsaFr = ScannerUtil.inputString("Masukkan Tanggal: ", scn);
                double beratfr = ScannerUtil.inputDouble("Masukkan Berat: ", scn);
                int stokfr= ScannerUtil.inputInt("Masukkan Stok: ", scn);
                double hargafr = ScannerUtil.inputDouble("Masukkan Harga: ", scn);
                double suhu = ScannerUtil.inputDouble("Masukkan Suhu: ", scn);
                
                Controller.addFrozenFood(idFr, namaFr, hargafr, stokfr, beratfr,suhu, tanggalKadaluarsaFr);
                // (String id, String nama, double harga, int stok, double suhuPenyimpanan, String tanggalKadaluarsa)
                break;
        }
    }
}
