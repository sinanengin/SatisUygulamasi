public class Main extends Static {

    public static void main(String[] args) {
        while (loop)
        {
            System.out.println("HA BURAYA GİRDİ");
            menu = new MainMenu();
            menu.menu();

            if (UserLogin)
            {
                loop = true;
                menu = new UserMenu();
                menu.menu();
                System.out.println("Menüden çıktı");
                UserLogin=false;
                loop = true;
            }
        }
    }
}