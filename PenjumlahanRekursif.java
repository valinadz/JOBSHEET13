import java.util.Scanner;

public class PenjumlahanRekursif {
    static int jumlahkanBilangan(int f) {
        if (f == 0) {
            return 0;
        } else {
            return f + jumlahkanBilangan(f - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f untuk penjumlahan: ");
        int f = sc.nextInt();
        sc.close();

        int hasilJumlah = jumlahkanBilangan(f);
        System.out.println("Penjumlahan bilangan 1 sampai " + f + " = " + hasilJumlah);
    }
}
