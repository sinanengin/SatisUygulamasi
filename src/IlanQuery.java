import java.util.ArrayList;

public class IlanQuery {

    private String baslik;
    private String aciklama;

    IlanQuery(){};

    IlanQuery(String baslik){ this.baslik = baslik; }

    IlanQuery(String baslik, String aciklama)
    {
        this.baslik = baslik;
        this.aciklama = aciklama;
    }

    public boolean createQuery()
    {
        if(baslik.length()<8) {
            System.out.println("ilan baslığı 0dan küçük olamaz...");
            return true;
        }
        return false;
    }
}