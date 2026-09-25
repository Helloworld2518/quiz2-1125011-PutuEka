package quiz2.Model;

public abstract class Product {
    private String id;
    private String nama;
    private double harga;
    private int stok;

    public Product(String id, String nama, double harga, int stok){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }
    public double getHarga(){
        return harga;
    }

    public void setStok(int stok){
        this.stok = stok;
    }
    public int getStok(){
        return stok;
    }

    public String getProduct(){
        return getProductDetail();
    }
    abstract String getProductDetail();
    abstract double calculateSubTotal(int amount);
}
