import java.util.Scanner;

public class CekPrimaRekursif {
    static boolean cekPrima(int n, int i) {
        if (i <= 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return cekPrima(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n untuk pengecekan bilangan prima: ");
        int n = sc.nextInt();
        sc.close();
 
        boolean hasil = cekPrima(n, n - 1);

        if (hasil) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}
