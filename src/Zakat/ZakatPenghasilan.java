package Zakat;

import java.io.*;

public class ZakatPenghasilan extends Zakat{
    private double ketentuan;

    ZakatPenghasilan(String amil, String muzakki, double jmlKekayaan){
        super(jmlKekayaan);
    }
    public double getKetentuan() {
        return getJmlKekayaan() * this.ketentuan;
    }

    void inputZakatPenghasilan(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("====== INPUT ZAKAT PENGHASILAN =====");
            System.out.print("Input Amil : ");
            Amil = input.readLine();
            setAmil(Amil);

            System.out.print("Input Muzaki : ");
            Muzakki = input.readLine();
            setMuzakki(Muzakki);

            System.out.print("Input Jumlah Kekayaan (Rp) : ");
            JmlKekayaan = Double.parseDouble(input.readLine());

            //validasi nishab
            if (JmlKekayaan <= 6800000 ){
                ketentuan = 0.0;
            } else {
                ketentuan = 0.025;
            }
            setJmlKekayaan(JmlKekayaan);
        } catch (Exception e){
            System.out.println("Error!!");
        }
    }
    void DisplayZakatPenghasilan(){
        System.out.println("======= CETAK ZAKAT PENGHASILAN ======");
        System.out.println("Amil : "+getAmil());
        System.out.println("Muzakki : "+getMuzakki());
        System.out.println("Jumlah Kekayaan : Rp" + getJmlKekayaan());
        System.out.println("Ketentuan Zakat : Rp" + getKetentuan());
    }
}