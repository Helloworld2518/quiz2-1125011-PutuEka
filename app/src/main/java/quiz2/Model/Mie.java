package quiz2.Model;

public class Mie extends Product implements Discountable{
    private String rasa;
    private double berat;

    public Mie(String id, String nama, double harga, int stok, String rasa, double berat){
        super(id, nama, harga, stok);
        this.rasa = rasa;
        this.berat = berat;
    }

    public void setRasa(String rasa){
        this.rasa = rasa;
    }
    public String getRasa(){
        return rasa;
    }

    public void setBerat(double berat){
        this.berat = berat;
    }
    public double getBerat(){
        return berat;
    }

    @Override 
    String getProductDetail(){
        return "Mie: " + getNama() + " ID: " + getId() + " - Harga: " + getHarga() + "| Stok: " + getStok() + " | Rasa: " + getRasa() + " | Berat: " + getBerat();
    }

    @Override 
    public double calculateDiscount(int amount){
        double total = 0;
        if (amount >= 20){
            total = 0.1 * getHarga();
        }
        else if(amount >= 10){
            total = 0.05 * getHarga();
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
