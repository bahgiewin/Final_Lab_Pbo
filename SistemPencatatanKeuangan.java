import java.util.Scanner;

public class SistemPencatatanKeuangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("===== Sistem Pencatatan Keuangan =====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Tambah Pemasukan");
            System.out.println("3. Tambah Pengeluaran");
            System.out.println("0. Keluar");
            System.out.println("========================================");
            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda saat ini: " + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah pemasukan: ");
                    double pemasukan = input.nextDouble();
                    saldo += pemasukan;
                    System.out.println("Pemasukan berhasil ditambahkan.");
                    break;
                case 3:
                    System.out.print("Masukkan jumlah pengeluaran: ");
                    double pengeluaran = input.nextDouble();
                    saldo -= pengeluaran;
                    System.out.println("Pengeluaran berhasil ditambahkan.");
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();
        }
    }
}
