package tgs_pemlan5;

public class kuePesanan extends kue {
    private double berat;

    public kuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public double hitungHarga() {
        return super.getHarga() * berat;

    }

    public String toString() {
        return "Kue Pesanan: " + getNama() + ", Harga: Rp " + getHarga() + ", Berat: " + getBerat() + " kg";
    }

}
