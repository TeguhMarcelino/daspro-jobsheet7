import java.util.Scanner;

public class Tugas1Perulangan1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tiket, hargaTiket = 50000;
        int hargaNormal;
        String lagi;
        double totalHarga, akumulasiHarga = 0;

        do {
            System.out.print("Apakah anda ingin membeli tiket? (Ya/Tidak): ");
            lagi = sc.next();
                if (lagi.equalsIgnoreCase("Tidak")) {
                    System.out.println("Total harga tiket: Rp " + akumulasiHarga);
                    break;
                }
            System.out.print("Masukkan jumlah tiket: ");
            Tiket = sc.nextInt();
            if (Tiket < 0) {
                System.out.println("Tidak valid, harap masukkan jumlah tiket yang benar");
                continue;
            }
            if (Tiket > 10) {
                hargaNormal = Tiket * hargaTiket;
                totalHarga = hargaNormal - (hargaNormal * 0.15);
                akumulasiHarga += totalHarga;
            } else if (Tiket > 5) {
                hargaNormal = Tiket * hargaTiket;
                totalHarga = hargaNormal - (hargaNormal * 0.10);
                akumulasiHarga += totalHarga;
            } else {
                hargaNormal = Tiket * hargaTiket;
                totalHarga = hargaNormal;
                akumulasiHarga += totalHarga;
            }
            
        } while (lagi.equalsIgnoreCase("Ya"));
        sc.close();
    }
} 
