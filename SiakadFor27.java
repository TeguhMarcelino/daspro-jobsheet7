import java.util.Scanner;
    public class SiakadFor27 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double nilai, tertinggi = 0, terendah = 100;
            int l = 0, tl = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.print("Masukkan nilai ke-" + i + ": ");
                nilai = sc.nextDouble();
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai < terendah) {
                    terendah = nilai;
                }
                if (nilai > 60) {
                    l++;
                } else {
                    tl++;
                }
            }
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            System.out.println("Jumlah yang lulus: " + l);
            System.out.println("Jumlah yang tidak lulus: " + tl);
            sc.close();
        }

    }