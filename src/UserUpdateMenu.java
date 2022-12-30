public class UserUpdateMenu extends Static implements Menu {
    @Override
    public void menu() {

        boolean kontrol = true, check = true;
        int secim = 0;

        while (kontrol) {

            System.out.println("\n\n***************Güncelleme Ekranı***************\n");
            System.out.println("[1] İsim");
            System.out.println("[2] Soyisim");
            System.out.println("[3] Telefon Numarası");
            System.out.println("[4] Email");
            System.out.println("[5] Adres");
            System.out.println("[6] Geri Dön");
            System.out.print("Güncellemek İstediğiniz Bilgiyi Seçiniz: ");

            while (check) {
                try {
                    secim = scanner.nextInt();
                    check = false;
                } catch (Exception e) {
                    System.out.println("Bir Hata Oluştu..");
                    System.out.println("Tekrar Deneyiniz...\n\n");
                }
            }

            switch (secim) {
                case 1:
                    new UserUpdate().updateFirstName();
                    System.out.println("\n\nBAŞARIYLA GÜNCELLENDİ...\n\n");
                    break;
                case 2:
                    new UserUpdate().updateLastName();
                    System.out.println("\n\nBAŞARIYLA GÜNCELLENDİ...\n\n");
                    break;
                case 3:
                    new UserUpdate().updatePhone();
                    System.out.println("\n\nBAŞARIYLA GÜNCELLENDİ...\n\n");
                    break;
                case 4:
                    new UserUpdate().updateEmail();
                    System.out.println("\n\nBAŞARIYLA GÜNCELLENDİ...\n\n");
                    break;
                case 5:
                    new UserUpdate().updateAddress();
                    System.out.println("\n\nBAŞARIYLA GÜNCELLENDİ...\n\n");
                    break;
            }
            kontrol = false;
        }
    }
}