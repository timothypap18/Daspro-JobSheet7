import java.util.Scanner;
public class SiakadWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, nilai, jumlah;
        System.out.println("Masukkan jumlah mahasiswa: ");
        jumlah = sc.nextInt();
        while (i < jumlah) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai yang benar!");
                continue;
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " Nilai A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " Nilai B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " Nilai B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " Nilai C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " Nilai C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " Nilai D");
            } else {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " Nilai E");
            }
            i++;
        }
    }
}
