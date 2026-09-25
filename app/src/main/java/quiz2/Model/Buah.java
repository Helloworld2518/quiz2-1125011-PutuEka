package quiz2.Model;

public class Buah extends Product implements  Discountable, Expireable{
    private JenisBuah jenis;
    private double berat;
    private String tanggalKadaluarsa;

    public Buah(String id, String nama, double harga, int stok, JenisBuah jenis, double berat, String tanggalKadaluarsa){
        super(id, nama, harga, stok);
        this.jenis = jenis;
        this.berat = berat;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public void setJenis(JenisBuah jenis){
        this.jenis = jenis;
    }
    public JenisBuah getJenis(){
        return jenis;
    }

    public void setBerat(double berat){
        this.berat = berat;
    }
    public double getBerat(){
        return berat;
    }

    public void setTanggalKadaluarsa(String tanggal){
        this.tanggalKadaluarsa = tanggal;
    }
    
    @Override 
    public String getExpiry(){
        return tanggalKadaluarsa;
    }

    @Override 
    String getProductDetail(){
        return "Buah-Buahan: " + getNama() + " ID: " + getId() + " - Harga: " + getHarga() + "| Stok: " + getStok() + " | Jenis: " + getJenis() + " | Berat: " + getBerat() + "| Kadaluarsa: " + getExpiry();
    }

    @Override 
    public double calculateDiscount(int amount){
        double total = 0;
        if (amount >= 15){
            total = 0.05 * getHarga();
        }
        else if(amount >= 10){
            total = 0.03 * getHarga();
        }
        else if(amount >= 5){
            total = 0.02 * getHarga();
        }
        else{
            total = 0;
        }
        return total;
    }

    @Override 
    double calculateSubTotal(int amount){
        double subTotal = (getHarga() * amount) - calculateDiscount(amount);
        return subTotal;
    }
}
