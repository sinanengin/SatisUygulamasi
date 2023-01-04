public class Arsa extends Emlak {
    double mKareFiyat;
    String imarDurum;

    public Arsa(int ilanID, int userID, String baslik, String aciklama, int fiyat, int mkare, boolean kredi, double mKareFiyat, String imarDurum) {
        super(ilanID, userID, baslik, aciklama, fiyat, mkare, kredi);
        this.mKareFiyat = mKareFiyat;
        this.imarDurum = imarDurum;
    }

    public double getmKareFiyat() {
        return mKareFiyat;
    }

    public String getImarDurum() {
        return imarDurum;
    }

}