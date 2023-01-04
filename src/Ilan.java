import java.util.ArrayList;

public class Ilan
{
    private int ilanID;
    private int kategoriID;
    private int userID;
    public String baslik;
    public String aciklama;
    public int fiyat;

    ArrayList<Otomobil> otomobiller = new ArrayList<>();
    ArrayList<Motosiklet> motosikletler = new ArrayList<>();
    ArrayList<Daire> daireler = new ArrayList<>();
    ArrayList<Arsa> arsalar = new ArrayList<>();

    public Ilan() {}
    public Ilan(int ilanID, int userID, String baslik, String aciklama, int fiyat)
    {
        this.ilanID = ilanID;
        this.userID = userID;
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
    }
    public int getIlanID(){ return ilanID; }
    public int getKategoriID() {return kategoriID; }
    public int getUserID() { return userID; }
    public String getBaslik() {return baslik; }
    public String getAciklama() {return aciklama; }
    public int getFiyat(){return fiyat; }

    public void setIlanID(int ilanID){ this.ilanID = ilanID; }
    public void setKategoriID(int kategoriID){ this.kategoriID = kategoriID; }
    public void setUserID(int userID){ this.userID = userID; }
    public void setBaslik(String baslik) {this.baslik = baslik;}
    public void setAciklama(String aciklama) {this.aciklama=aciklama;}
    public void setFiyat(int fiyat){ this.fiyat = fiyat; }

}