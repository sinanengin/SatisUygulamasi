public class Vasita extends Ilan{

    private String marka;
    private String model;
    private String vitesTipi;
    private String renk;
    private int uretimYili;
    public Vasita(int ilanID, int userID, String baslik, String aciklama, int fiyat, String marka, String model, String vitesTipi, String renk, int uretimYili)
    {
        super(ilanID, userID, baslik, aciklama, fiyat);
        this.marka = marka;
        this.model = model;
        this.vitesTipi = vitesTipi;
        this.renk = renk;
        this.uretimYili = uretimYili;
        setKategoriID(1);
    }
    public String getMarka(){ return marka; }
    public String getModel(){ return model; }
    public String getVitesTipi(){ return vitesTipi; }
    public String getRenk(){ return renk; }
    public int getUretimYili(){ return uretimYili;}
}