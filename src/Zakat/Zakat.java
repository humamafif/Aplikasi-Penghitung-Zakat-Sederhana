package Zakat;

public class Zakat {
    protected static String Amil;
    protected static String Muzakki;
    protected static double JmlKekayaan = 0;

    Zakat(){
        Zakat.JmlKekayaan = 0;
    }
    Zakat(double JmlKekayaan){
        Zakat.JmlKekayaan = JmlKekayaan;
    }

    public String getMuzakki() {
        return Muzakki;
    }
    public void setMuzakki(String muzakki) {
        Muzakki = muzakki;
    }

    public String getAmil() {
        return Amil;
    }
    public void setAmil(String amil) {
        Amil = amil;
    }

    public double getJmlKekayaan() {
        return JmlKekayaan;
    }
    public void setJmlKekayaan(double jmlKekayaan) {
        JmlKekayaan = jmlKekayaan;
    }
}