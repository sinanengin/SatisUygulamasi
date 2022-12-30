public class Daire extends Emlak {

    String odaSayisi, isitma, adres;
    int binaYas, katSayisi, aidat;

    public Daire(int ilanID, int userID, String baslik, String aciklama, int fiyat, int mkare, boolean kredi,
                 String odaSayisi, String isitma, String adres, int binaYas, int katSayisi, int aidat) {
        super(ilanID, userID, baslik, aciklama, fiyat, mkare, kredi);
        this.odaSayisi = odaSayisi;
        this.isitma = isitma;
        this.adres = adres;
        this.binaYas = binaYas;
        this.katSayisi = katSayisi;
        this.aidat = aidat;
    }


}