import java.util.Scanner;

public class Tugas2Perulangan1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do {
            System.out.print("Masukkan jenis kendaraan ('1' untuk mobil, '2' untuk motor, '0' untuk keluar: ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);
        sc.close();
        System.out.println("Total biaya parkir: Rp " + total);
    }
}