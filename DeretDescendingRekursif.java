import java.util.Scanner;

public class DeretDescendingRekursif {
    static void tampilkanDeretRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            tampilkanDeretRekursif(n - 1);
        }
    }

    static void tampilkanDeretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Deret Descending (Rekursif):");
        tampilkanDeretRekursif(n);

        System.out.println("\nDeret Descending (Iteratif):");
        tampilkanDeretIteratif(n);
    }
}
