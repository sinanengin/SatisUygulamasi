import java.io.IOException;

public class IlanListMenu extends MainMenu implements Menu{

    @Override
    public void menu()
    {
        int secim = 0;
        System.out.println("[1] Vasıta");
        System.out.println("[2] Emlak");
        System.out.println("Listelemek İstediğiniz İlan Kategorisini Seçiniz: ");
        secim = scanner.nextInt();

        switch (secim)
        {
            case 1:
                System.out.println("[1] Otomobil");
                System.out.println("[2] Motosiklet");
                System.out.println("Listelemek İstediğiniz İlan Türünü Seçiniz: ");
                secim = scanner.nextInt();
                switch (secim)
                {
                    case 1:
                        new IlanList().ListOtomobil();
                        try {
                            System.out.println("Devam etmek için ENTER tuşuna basınız...");
                            System.in.read();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 2:
                        new IlanList().ListMotosiklet();
                        System.out.println("\n\n****** İLANINIZ YAYIMLANDI ****** ");
                        try {
                            System.out.println("Devam etmek için ENTER tuşuna basınız...");
                            System.in.read();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("[1] Daire");
                System.out.println("[2] Arsa");
                System.out.println("Listelemek stediğiniz İlan Türünü Seçiniz: ");
                secim = scanner.nextInt();
                break;

        }
    }
}