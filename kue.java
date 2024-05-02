package tgs_pemlan5;

public abstract class kue {
    private String nama;
    private double harga;

    abstract double hitungHarga();

    public kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}
