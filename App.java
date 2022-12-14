import java.util.Scanner;

public class App {
    public static Scanner get = new Scanner(System.in);
    public static void main(String[] args) {
        String[][]daftar_gedung = {
                {"Gedung Alpaka", "Jalan Alpaka No 22","Tersedia"},
                {"Gedung Serigala", "Jalan Purnama No 4","Tersedia"},
                {"Gedung Kelinci", "Jalan Usagi No 6", "Tersedia"},
                {"Gedung Domba", "Jalan Domba yang tersesat no 3", "Tersedia"},
                {"Gedung Macan Putih", "Jalan Kediri no 1", "Tersedia"},
                {"Gedung Adam", "Jalan Homo Sapiens no 1", "Tersedia"}
        };
        mainMenu(daftar_gedung);
    }
    public static void printDaftarGedung(String[][] daftar_gedung){
        for (int i = 0; i < daftar_gedung.length; i++) {
            System.out.println( ( i + 1 ) + ". " + daftar_gedung[i][0] );
        }
    }
    public static void printInfoGedung(String[][] daftar_gedung, int opsi){
        int i = opsi;
        System.out.println(
                "\nNama Gedung \t\t= " + daftar_gedung[i][0] +
                "\nLokasi Gedung \t\t= " + daftar_gedung[i][1] +
                "\nStatus gedung \t\t= " + daftar_gedung[i][2]);

    }
    public  static void mainMenu(String[][] daftar_gedung){
        System.out.println(
                "Selamat Datang Di Aplikasi Penyewaan Gedung" +
                        "Gedung Yang Masih Tersedia");
        printDaftarGedung(daftar_gedung);
        System.out.print("Pilih Gedung Yang Ingin Di Sewa!/Kembali 0");
        int opsi = get.nextInt();
        switch (opsi){
            case 0:
                System.exit(0);
                break;
            case 1:
                gedungMenu(0, daftar_gedung);
                break;
            case 2:
                gedungMenu(1, daftar_gedung);
            case 3:
                gedungMenu(2, daftar_gedung);
                break;
            case 4:
                gedungMenu(3, daftar_gedung);
                break;
            case 5:
                gedungMenu(4, daftar_gedung);
                break;
            case 6:
                gedungMenu(5, daftar_gedung);
                break;
            default:
                System.out.println("Input Salah");
                mainMenu(daftar_gedung);
        }
    }
    public static void gedungMenu(int opsi, String[][] daftar_gedung){
        printInfoGedung(daftar_gedung, opsi);
        System.out.print(
                "1. Sewa Gedung Ini" +
                "\n2. Berhenti Sewa" +
                        "\n0. Kembali" +
                        "\nMasukkan Pilihan Anda ");
        int opsi1 = get.nextInt();
        int i = opsi;
        switch (opsi1) {
            case 1:
                System.out.println("Gedung Berhasil Di Sewa");
                daftar_gedung[i][2] = "Disewa";
                gedungMenu(opsi, daftar_gedung);
                break;
            case 2:
                System.out.println("Penyewaan Berhenti");
                daftar_gedung[i][2] = "Tersedia";
                break;
            case 0:
                mainMenu(daftar_gedung);
            default:
                System.out.println("Input Salah");
                gedungMenu(opsi, daftar_gedung);
        }
    }
}

