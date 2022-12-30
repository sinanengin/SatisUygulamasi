public class MainMenu extends Main implements Menu{
    @Override
    public void menu(){

        while(secim != 0)
        {
            System.out.println("************ SATIŞ UYGULAMASINA HOŞGELDİNİZ ************ ");
            System.out.println("[1] Giriş Yap");
            System.out.println("[2] Kayıt Ol");
            System.out.println("[3] Çıkış Yap");
            System.out.print("\nLütfen seçiminizi yapınız: ");

            boolean check = true;
            while (check)
            {
                try
                {
                    secim = scanner.nextInt();
                    check = false;
                }
                catch (Exception e)
                {
                    System.out.println("Programda bir hata oluştu...");
                    System.out.println("Ana Menüye Yönlendiriliyorsunuz...");
                }
            }

            switch (secim)
            {
                case 1:
                    if (new AccountCreate().loginAccountCheck(accounts,registerId))
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Giriş için yönlendiriliyorsunuz..");
                        try
                        {
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e){
                            throw new RuntimeException(e);
                        }
                        new AccountLogin().Login();
                    }
                    break;
                case 2:
                    System.out.println("********** KAYIT OL **********\n");
                    new AccountRegister().Register();
                    System.out.println("Ana Menüye Yönlendiriliyorsunuz...");
                    break;

                case 3:
                    System.out.println("Uygulamamızı kullandığınız için teşekkürler..");
                    System.out.println("Çıkış Yapılıyor....");
                    secim = 0;
                    break;
                default:
                    System.out.println("Yanlış Seçim Yaptınız Lütfen Tekrar Deneyiniz..");
                    break;
            }
        }

    }


}
