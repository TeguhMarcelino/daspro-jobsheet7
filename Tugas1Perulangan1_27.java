import java.util.Scanner;

public class Tugas1Perulangan1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tiket, hargaTiket = 50000;
        int hargaNormal;
        double totalHarga;

        for (int i = 1; i <= 1; i++) {
            System.out.print("Masukkan jumlah Tiket: ");
            Tiket = sc.nextInt();
            if (Tiket < 0) {
                System.out.println("Jumlah tiket tidak valid, masukkan nominal kembali.");
            } else {
                if (Tiket > 10) {
                    hargaNormal = Tiket * hargaTiket;
                    totalHarga = hargaNormal - (0.15 * hargaNormal);
                } else if (Tiket > 4) {
                    hargaNormal = Tiket * hargaTiket;
                    totalHarga = hargaNormal - (0.10 * hargaNormal);
                } else {
                    hargaNormal = Tiket * hargaTiket;
                    totalHarga = hargaNormal;
                }
                System.out.println("Total harga: Rp " + totalHarga);
            }
        }
        sc.close();
    }
} 
