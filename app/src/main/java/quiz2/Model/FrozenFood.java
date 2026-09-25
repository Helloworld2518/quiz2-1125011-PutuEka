package quiz2.Model;

public class FrozenFood extends Product implements Discountable, Expireable{
    double suhuPenyimpanan;
    String tanggalKadaluarsa;

    public FrozenFood(String id, String nama, double harga, int stok, double suhuPenyimpanan, String tanggalKadaluarsa){
        super(id, nama, harga, stok);
        this.suhuPenyimpanan = suhuPenyimpanan;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public void setSuhuPenyimpanan(double suhu){
        this.suhuPenyimpanan = suhu;
    }
    public double getSuhuPenyimpanan(){
        return suhuPenyimpanan;
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
        return "Buah-Buahan: " + getNama() + " ID: " + getId() + " - Harga: " + getHarga() + "| Stok: " + getStok() + " | suhuPenyimpanan: " + getSuhuPenyimpanan() + "| Kadaluarsa: " + getExpiry();
    }

    @Override 
    public double calculateDiscount(int amount){
        double total = 0;
        if (amount >= 8){
            total = 0.08 * getHarga();
        }
        else if(amount >= 4){
            total = 0.04 * getHarga();
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
