package tgs_pemlan5;

public class kueJadi extends kue {
    private double jumlah;

    public kueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public double hitungHarga() {
        return super.getHarga() * 2 * jumlah;
    }

    public String toString() {
        return "Kue Jadi: " + getNama() + ", Harga: Rp " + getHarga() + ", Jumlah: " + getJumlah() + " buah";
    }
}
