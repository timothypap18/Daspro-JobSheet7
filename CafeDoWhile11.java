import java.util.Scanner;
public class CafeDoWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 15000, hargaTeh = 7000, hargaRoti = 20000;
        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("Batal")) {
                System.out.println("Transaksi Dibatalkan.");
                break;
            }
            System.out.println("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.println("Jumlah Roti: ");
            roti = sc.nextInt();
            int totalHarga = (kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Total yang harus dibayar adalah Rp " + totalHarga);
            sc.nextLine();
        } while (true);
    }
}
