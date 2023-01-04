public class UserMenu extends Main implements Menu {
    @Override
    public void menu() {
        secim = -1;

        while (secim != 0)
        {
            System.out.println("\nİyi Günler");
            System.out.println(users.get(loginId).getFirstName() + " " + users.get(loginId).getLastName().toUpperCase());

            System.out.println("\n[1] İlanlara Göz At");
            System.out.println("[2] İlan Oluştur");
            System.out.println("[3] İlan Sil");
            System.out.println("[4] İlanlarım");
            System.out.println("[5] Kullanıcı Bilgilerini Görüntüle");
            System.out.println("[6] Kullanıcı Bilgilerini Güncelle");
            System.out.println("[7] Hesaptan Çıkış Yap");
            System.out.print("\nSeçiminizi yapınız: ");
            boolean check = true;
            while (check)
            {
                try
                {
                    secim = scanner.nextInt();
                    check = false;
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("Programda bir hata oluştu...");
                    System.out.println("Lütfen Seçiminizi Tekrar Yapınız...");

                }
            }

            switch (secim) {
                case 1:
                    System.out.println("***************************************");
                    new IlanListMenu().menu();
                    try
                    {
                        System.out.println("Devam etmek için ENTER tuşuna basınız");
                        System.in.read();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Sistemde Bir Hata Oluştu!..");
                    }
                    System.out.println("\n\n***************************************");
                    break;
                case 2:
                    new IlanMenu().menu();
                    break;
                case 3:
                    new IlanDelete().deleteIlan();
                    break;
                case 4:
                    new IlanList().ListUser();
                    break;
                case 5:
                    new UserInformation().userInformation();
                    break;
                case 6:
                    new UserUpdateMenu().menu();
                    break;
                case 7:
                    System.out.println("Hesaptan Çıkılıyor...");
                    secim = 0;
                    loop = false;
                    break;

            }


        }
    }
}