
public class UserInformation extends Static{

    public void userInformation(){

        System.out.println("\n\n\n\n*****************Hesap Bilgilerim*****************\n\n");
        System.out.println("İsim: " + users.get(loginId).getFirstName());
        System.out.println("Soyisim: " + users.get(loginId).getLastName());
        System.out.println("Telefon: " + users.get(loginId).getPhone());
        System.out.println("Email: " + users.get(loginId).getEmail());
        System.out.println("Adres: " + users.get(loginId).getAdress());
        System.out.print("Bilgileriniz Yukarıda Yer Almaktadır Devam Etmek İçin Lütfen Bir Tuşa Basınız...");
        try
        {
            System.in.read();
        }
        catch (Exception e) {
            System.out.println("Bir Hata Oluştu...");
        }

    }
}