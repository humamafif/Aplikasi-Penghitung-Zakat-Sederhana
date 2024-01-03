package Zakat;
import java.io.*;
public class ZakatPertanian extends Zakat{
    private double ketentuan;

    ZakatPertanian(String amil, String muzakki, double jmlKekayaan){
        super(jmlKekayaan);
    }
    public double getKetentuan() {
        return getJmlKekayaan() * this.ketentuan;
    }

    void inputZakatPertanian(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("====== INPUT ZAKAT PERTANIAN =====");
            System.out.print("Input Amil : ");
            Amil = input.readLine();
            setAmil(Amil);

            System.out.print("Input Muzaki : ");
            Muzakki = input.readLine();
            setMuzakki(Muzakki);

            System.out.print("Input Jumlah Kekayaan (kg) : ");
            JmlKekayaan = Double.parseDouble(input.readLine());

            //validasi nishab
            if (JmlKekayaan <= 500 ){
                ketentuan = 0.0;
            } else {
                ketentuan = 0.05;
            }
            setJmlKekayaan(JmlKekayaan);
        } catch (Exception e){
            System.out.println("Error!!");
        }
    }
    void DisplayZakatPertanian(){
        System.out.println("======= CETAK ZAKAT PERTANIAN ======");
        System.out.println("Amil : "+getAmil());
        System.out.println("Muzakki : "+getMuzakki());
        System.out.println("Jumlah Kekayaan : " + getJmlKekayaan()+"kg");
        System.out.println("Ketentuan Zakat : " + getKetentuan()+"kg");
    }
}