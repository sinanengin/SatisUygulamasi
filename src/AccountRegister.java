public class AccountRegister extends Main{
    boolean check = true;

    public void Register()  {
        while(check)
        {
            String username, password, firstName, lastName, phone, email, adress;
            System.out.println("Kullanıcı Adı: ");
            username = scanner.next();
            System.out.println("Şifre: ");
            password = scanner.next();

            if(new AccountCreate(username).registerCheck(accounts))
            {
                System.out.println("** Bu Kullanıcı Adı Daha Önce Alınmış! **\n");
                while (true) {
                    System.out.println("Kayıt İşlemine Devam Etmek İstiyor Musunuz? (Evet/Hayır)-> ");
                    String devam = scanner.next();
                    if (devam.equalsIgnoreCase("evet"))
                    {
                        System.out.println("***Lütfen Kullanıcı Adınızı Tekrar Oluşturunuz...***");


                    }
                    else if (devam.equalsIgnoreCase("hayır"))
                    {
                        System.out.println("Kayıt İşlemi İptal Ediliyor...");

                        System.out.println("Ana Menüye Dönülüyor...\n\n");

                        check = false;
                    } else {
                        System.out.println("Hatalı işlem girdiniz lütfen tekrar deneyiniz...");
                    }
                }

            }
            else
            {

                accounts.add(new Account());
                accounts.get(registerId).SetUsername(username);
                accounts.get(registerId).SetPassword(password);
                accounts.get(registerId).SetId(registerId);
                check = false;
                System.out.println("**** Hesap Oluşturma İşlemi Başarılı...****\n\n");
                users.add(new User());
                System.out.println("Ana Menüye Dönebilmek İçin Bilgilerinizi Doldurunuz...\n");

                System.out.print("İsminizi giriniz: ");
                firstName = scanner.next();
                System.out.print("Soyisminizi giriniz: ");
                lastName = scanner.next();
                System.out.print("Telefon Numaranızı giriniz: ");
                phone = scanner.next();
                System.out.print("E-Posta Adresinizi giriniz: ");
                email = scanner.next();
                System.out.print("Adresinizi giriniz: ");
                adress = scanner.next();

                users.get(registerId).setFirstName(firstName);
                users.get(registerId).setLastName(lastName);
                users.get(registerId).setPhone(phone);
                users.get(registerId).setEmail(email);
                users.get(registerId).setAdress(adress);
                registerId++;
                ilanlar.add(new Ilan());

            }

        }
    }
}