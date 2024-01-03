package Zakat;
import java.io.*;

public class Main extends Zakat{
    public static void main(String[] args) {
        ZakatPertanian ob1 = new ZakatPertanian(Amil, Muzakki, JmlKekayaan);
        ZakatPenghasilan ob2 = new ZakatPenghasilan(Amil, Muzakki, JmlKekayaan);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("===== Aplikasi Menghitung Zakat =====");
            while (true){
                System.out.println("1. Zakat Penghasilan\n" +
                                    "2. Zakat Pertanian");
                System.out.print("Masukan Pilihan : ");
                int pilihan = Integer.parseInt(input.readLine());
                if (pilihan == 1) {
                    ob2.inputZakatPenghasilan();
                    ob2.DisplayZakatPenghasilan();
                }else if (pilihan == 2) {
                    ob1.inputZakatPertanian();
                    ob1.DisplayZakatPertanian();
                } else {
                    System.out.println("Maaf Pilihan Tidak Tersedia");
                    System.out.println("====== TERIMA KASIH ======");
                    //validasi pilihan zakat
                    System.out.print("Apakah anda ingin menghitung lagi (y / x): ");
                    String b = input.readLine();
                    if (b.equals("y") || b.equals("Y")) {
                        continue;
                    } else if (b.equals("x") || b.equals("X")) {
                        System.out.println("====== TERIMA KASIH ======");
                        break;
                    } else {
                        System.out.println("Maaf Pilihan Tidak Tersedia");
                        System.out.println("====== TERIMA KASIH ======");
                        break;
                    }
                }
                //validasi ingin menghitung lagi atau tidak
                System.out.print("Apakah anda ingin menghitung lagi (y / x): ");
                String a = input.readLine();
                if (a.equals("y") || a.equals("Y")) {
                    continue;
                } else if (a.equals("x") || a.equals("X")) {
                    System.out.println("====== TERIMA KASIH ======");
                    break;
                } else {
                    System.out.println("Maaf Pilihan Tidak Tersedia");
                    System.out.println("====== TERIMA KASIH ======");
                    break;
                }
            }
        } catch (Exception e){
            System.err.println("Maaf inputan anda salah");
        }
    }
}