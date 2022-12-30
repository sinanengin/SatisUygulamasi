public class Motosiklet extends Vasita{

    private int motorHacim;
    private String motorTip;

    public Motosiklet(int ilanID, int userID, String baslik, String aciklama,
                      int fiyat, String marka, String model, String vitesTipi,
                      String renk, int uretimYili, int motorHacim, String motorTip) {
        super(ilanID, userID, baslik, aciklama, fiyat, marka, model, vitesTipi, renk, uretimYili);
        this.motorHacim = motorHacim;
        this.motorTip = motorTip;
    }

    public int getMotorHacim(){ return motorHacim; }
    public String getMotorTip(){ return motorTip; }



}