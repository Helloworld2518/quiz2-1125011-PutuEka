package quiz2.Controller;

import java.util.ArrayList;
import java.util.List;

import quiz2.Model.Buah;
import quiz2.Model.FrozenFood;
import quiz2.Model.JenisBuah;
import quiz2.Model.Mie;
import quiz2.Model.Product;
import quiz2.Model.Product;

public class Controller {
    private List<Product> listproduk;

    public Controller() {
        this.listproduk = new ArrayList<>();
    }

    public void addMie(String id, String nama, double harga, int stok, String rasa, double berat) {
        listproduk.add(new Mie(id, nama, harga, stok, rasa, berat));
    }

    public void addBuah(String id, String nama, double harga, int stok, JenisBuah jenis, double berat, String tanggalKadaluarsa) {
        listproduk.add(new Buah(id, nama, harga, stok, jenis, berat, tanggalKadaluarsa));
    }

    public void addFrozenFood(String id, String nama, double harga, int stok, double suhuPenyimpanan, String tanggalKadaluarsa) {
        listproduk.add(new FrozenFood(id, nama, harga, stok, suhuPenyimpanan, tanggalKadaluarsa));
    }

    public List<String> getProductAll() {
        List<String> allProduct = new ArrayList<>();
        for (Product p : allProduct) {
            allProduct.add(p.getProduct());
        }
        return allProduct;
    }

}


