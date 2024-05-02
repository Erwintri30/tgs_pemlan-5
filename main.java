package tgs_pemlan5;

public class main {
    public static void main(String[] args) {

        kue[] kue = {
                new kuePesanan("Kue Vanilla", 10000, 2),
                new kueJadi("Kue Coklat", 7000, 8),
                new kuePesanan("Kue Stroberi", 3000, 3),
                new kueJadi("Kue Keju", 5000, 6),
                new kuePesanan("Kue Pandan", 10000, 2),
                new kueJadi("Kue Durian", 7000, 6),
                new kuePesanan("Kue Mocha", 12000, 4),
                new kueJadi("Kue Matcha", 9000, 7),
                new kuePesanan("Kue Lemon", 11000, 2),
                new kueJadi("Kue Blueberry", 7500, 5),
                new kuePesanan("Kue Melon", 9500, 4),
                new kueJadi("Kue Tiramisu", 8500, 3),
                new kuePesanan("Kue Pistachio", 13000, 2),
                new kueJadi("Kue Strawberry Cheesecake", 10000, 4),
                new kuePesanan("Kue Red Velvet", 16000, 1),
                new kueJadi("Kue Banana", 7000, 8),
                new kuePesanan("Kue Hazelnut", 17000, 2),
                new kueJadi("Kue Pineapple", 8500, 6),
                new kuePesanan("Kue Apple Cinnamon", 14000, 3),
                new kueJadi("Kue Mango", 8000, 5)
        };

        System.out.println("--------- DAFTAR KUE -----------");
        for (kue item : kue) {
            System.out.println(item);
        }

        double total = 0;
        double totalHargaKuePesanan = 0;
        double totalHargaKueJadi = 0;
        double totalBerat = 0;
        double totalJumlah = 0;

        for (kue item : kue) {
            total += item.hitungHarga();
            if (item instanceof kuePesanan) {
                totalHargaKuePesanan += item.hitungHarga();
                totalBerat += ((kuePesanan) item).getBerat();
            } else if (item instanceof kueJadi) {
                totalHargaKueJadi += item.hitungHarga();
                totalJumlah += ((kueJadi) item).getJumlah();
            }
        }

        System.out.println("\n============= STATISTIK KUE =============\n");
        System.out.println("Total Harga Semua Kue:\t\t Rp " + total);
        System.out.println("==============================================");
        System.out.println("-- Kue Pesanan --");
        System.out.println("Total Harga Kue Pesanan:\t Rp " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan:\t " + totalBerat + " kg");
        System.out.println("===============================================");
        System.out.println("-- Kue Jadi --");
        System.out.println("Total Harga Kue Jadi:\t\t Rp " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi:\t\t " + totalJumlah + " buah");
        System.out.println("=============================================");

        double hargaTertinggi = 0;
        String namaKueTertinggi = "";
        String jenisKueTertinggi = "";

        for (kue item : kue) {
            if (item.hitungHarga() > hargaTertinggi) {
                hargaTertinggi = item.hitungHarga();
                namaKueTertinggi = item.getNama();
                jenisKueTertinggi = (item instanceof kuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            }
        }
        System.out.println("\n============= KUE TERTINGGI =============");
        System.out.println("Berdasarkan Jenis\t: " + jenisKueTertinggi);
        System.out.println("Berdasarkan Nama\t: " + namaKueTertinggi);
        System.out.println("Harga\t\t\t: Rp " + hargaTertinggi);

        System.out.println("---------------Thank You----------------------");

    }

}
