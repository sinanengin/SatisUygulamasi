public class Emlak extends Ilan{

    int mkare;
    boolean kredi;

    public Emlak(int ilanID, int userID, String baslik, String aciklama, int fiyat, int mkare, boolean kredi) {
        super(ilanID, userID, baslik, aciklama, fiyat);
        this.mkare = mkare;
        this.kredi = kredi;
        setKategoriID(2);
    }

    public int getMkare(){return mkare;}
    public boolean getKredi(){ return kredi; }
}