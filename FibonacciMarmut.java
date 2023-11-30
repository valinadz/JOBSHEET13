public class FibonacciMarmut {

    static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        int bulanKe12 = 12;

        System.out.println("Bulan ke\tJumlah Pasangan");
        for (int i = 1; i <= bulanKe12; i++) {
            System.out.println(i + "\t\t" + hitungPasanganMarmut(i));
        }

        int jumlahPasanganMarmut = hitungPasanganMarmut(bulanKe12);
        System.out.println("\nJumlah pasangan marmut pada akhir bulan ke-" + bulanKe12 + ": " + jumlahPasanganMarmut);
    }
}
