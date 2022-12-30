public class Otomobil extends Vasita {

    //private int otomobilId;
    private String kasa;
    private String yakit;
    private String cekis;

    public Otomobil(int ilanID, int userID, String baslik, String aciklama, int fiyat, String marka, String model, String vitesTipi, String renk, int uretimYili, String kasa, String yakit, String cekis)
    {
        super(ilanID, userID, baslik, aciklama, fiyat, marka, model, vitesTipi, renk, uretimYili);
        this.kasa = kasa;
        this.yakit = yakit;
        this.cekis = cekis;
    }

    // public int getOtomobilId(){ return otomobilId; }
    public String getKasa(){ return kasa; }
    public String getYakit(){ return yakit; }
    public String getCekis(){ return cekis; }


}