package tr.com.vardia.vardia;

public class Globals {

    private static Globals instance;

    private String baslik;
    private String tarih;
    private String saat;
    private String ilce;
    private String pozisyon;
    private String kiyafet;
    private String ucret;

    private Globals() {

    }


    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getBaslik() {
        return baslik;
    }


    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getTarih() {
        return tarih;
    }


    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getSaat() {
        return saat;
    }



    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getIlce() {
        return ilce;
    }



    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    public String getPozisyon() {
        return pozisyon;
    }



    public void setKiyafet(String kiyafet) {
        this.kiyafet = kiyafet;
    }

    public String getKiyafet() {
        return kiyafet;
    }



    public void setUcret(String ucret) {
        this.ucret = ucret;
    }

    public String getUcret() {
        return ucret;
    }

    public static  Globals getInstance(){
        if (instance == null){
            instance = new Globals();
        }

        return instance;
    }
}
