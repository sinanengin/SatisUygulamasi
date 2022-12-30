import java.util.ArrayList;

public class AccountLogin extends Main{

    String username, password;
    boolean check = true;
    String ask;
    public void Login()
    {
        while(check)
        {
            System.out.println("Kullanıcı Adı: ");
            username = scanner.next();
            System.out.println("Şifre: ");
            password = scanner.next();

            if (new AccountCreate(username,password).loginCheck(accounts))
            {
                check = false;
                System.out.println("Giriş Başarılı. Hoşgeldiniz!");
                UserLogin=true;
                secim = 0;
            }
            else
            {
                System.out.println("Hatalı giriş yaptınız..!\n");
                while (true) {
                    System.out.println("Giriş İşlemine Devam Etmek İstiyor Musunuz? (evet / hayır)");
                    ask = scanner.next();

                    if (ask.toLowerCase().equals("hayır"))
                    {
                        System.out.println("Giriş İşlemi Sonlandırılıyor...");
                        try {
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e)
                        {
                            System.out.println(e.toString());
                        }
                        check = false;
                        break;
                    } else if (ask.toLowerCase().equals("evet")) {
                        break;
                    } else {
                        System.out.println("Hatalı işlem girdiniz lütfen tekrar deneyiniz...");
                    }
                }
            }
        }

    }
}