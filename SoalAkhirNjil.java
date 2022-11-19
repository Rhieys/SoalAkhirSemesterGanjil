import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SoalAkhirNjil {

    // FUNCTION//
    public static void delayed(String jeda, int timing) {
        for (int i = 0; i < jeda.length(); i++) {
            char j = jeda.charAt(i);
            System.out.print(j);
            try {
                TimeUnit.MILLISECONDS.sleep(timing);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pesanan, jumlah;
        double suhu, totalakhir, total = 0, diskon;
        String vaksin, jawaban, namaorg;

        System.out.println("\t     Selamat Datang di JunChicken!"
                + "\n========================================================="
                + "\n      DISKON SPESIAL UNTUK SETIAP TOTAL PEMBELIAN"
                + "\nBAGI ANDA, PEMBELI DENGAN NAMA YANG MENGANDUNG UNSUR JU.."
                + "\n\t     AKAN MENDAPAT DISKON SEBESAR : 40%"
                + "\n=========================================================");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        delayed("Sebelum masuk ke dalam tempat makan, mohon jawab beberapa pertanyaan berikut : ", 50);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        delayed("\nApakah anda sudah divaksin  'sudah' atau 'belum'? ", 50);
        vaksin = input.nextLine();
        delayed("\nBerapakah suhu tubuh anda? ", 50);
        suhu = input.nextDouble();

        // PERCABANGAN//
        if (vaksin.equalsIgnoreCase("sudah") && suhu <= 37) {
            System.out.println("\t\tSELAMAT DATANG!\n"
                    + "-------------------------------------------------"
                    + "\nSilahkan pilih salah satu paket menu yang ada di bawah ini :"
                    + "\n1. Nasi+Ayam geprek+minum\t\tRp. 12.000"
                    + "\n2. Nasi+Ayam crispy+minum\t\tRp. 12.000"
                    + "\n3. Nasi Goreng+minum     \t\tRp. 14.000"
                    + "\n4. Nasi Goreng spesial+minum\t\tRp. 17.000"
                    + "\n-------------------------------------------------");

            do {
                totalakhir = total;
                delayed("\nMasukkan nomer dari menu : ", 50);
                pesanan = input.nextInt();
                while (pesanan > 4 || pesanan < 1) {
                    delayed("Mohon masukkan nomer dari menu paket yang sudah tersedia!", 50);
                    delayed("\nMasukkan nomer dari menu : ", 50);
                    pesanan = input.nextInt();
                }
                delayed("\nBerapakah jumlah pesanan anda? : ", 50);
                jumlah = input.nextInt();

                // ARRAY//
                String[] nama = { "Nasi+Ayam geprek+minum", "Nasi+Ayam crispy+minum", "Nasi Goreng+minum",
                        "Nasi Goreng spesial+minum" };
                int[] harga = { 12000, 12000, 14000, 17000 };

                // PERCABANGAN//
                switch (pesanan) {
                    case 1:
                        System.out.println("Anda memesan " + nama[0] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp. " + harga[0] + ",-");
                        total = totalakhir + (harga[0] * jumlah);
                        System.out.println("Total = Rp. " + (int) total + ",-");
                        break;
                    case 2:
                        System.out.println("Anda memesan " + nama[1] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp." + harga[1] + ",-");
                        total = totalakhir + (harga[1] * jumlah);
                        System.out.println("Total = Rp." + (int) total + ",-");
                        break;
                    case 3:
                        System.out.println("Anda memesan " + nama[2] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp." + harga[2] + ",-");
                        total = totalakhir + (harga[2] * jumlah);
                        System.out.println("Total = Rp." + (int) total + ",-");
                        break;
                    case 4:
                        System.out.println("Anda memesan " + nama[3] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp." + harga[3] + ",-");
                        total = totalakhir + (harga[3] * jumlah);
                        System.out.println("Total = Rp." + (int) total + ",-");
                        break;
                }

                // PERULANGAN//
                delayed("\nApakah anda ingin memesan lagi? \"y\" atau \"n\"", 50);
                jawaban = input.next();
            } while (jawaban.equalsIgnoreCase("y"));
            if (jawaban.equalsIgnoreCase("n")) {
                delayed("Masukkan nama anda untuk klaim diskon : *Mohon huruf pertama menggunakan huruf besar", 50);
                namaorg = input.next();
                String check;
                if (namaorg.contains("Ju")) {
                    System.out.println("\n=======================================");
                    System.out.println("Selamat anda mendapat diskon 40%");
                    diskon = total * 0.4;
                    total -= diskon;
                    System.out.println("Total pembayaran anda menjadi = Rp. " + (int) total + ",-");
                    System.out.println("=======================================");
                } else {
                    System.out.println("\n=======================================");
                    System.out.println("Total pembayaran anda menjadi = Rp. " + (int) total + ",-");
                    System.out.println("=======================================");
                }
            }

            // OUTPUT BERHASIL//
            delayed("\n----------------------------------------------------------------------------", 30);
            delayed("\nTerimakasih Sudah Memesan, Mohon tunggu, Pesanan anda sedang kami siapkan", 50);
            delayed("\n----------------------------------------------------------------------------", 30);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            delayed("\n\t\t--------------------------------", 30);
            delayed("\n\t\t\t---JunChicken---", 50);
            delayed("\n\t\t--------------------------------", 30);

        } else {

            // OUTPUT GAGAL//
            System.out.println("Mohon maaf, anda tidak dapat masuk ke dalam tempat makan ^_^!");
            System.out.println("\n");
            System.out.println("\t\t---------------------------");
            System.out.println("\t\t\tTERIMAKASIH!");
            System.out.println("\t\t---------------------------");

        }
    }
}
