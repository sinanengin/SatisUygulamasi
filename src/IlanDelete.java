public class IlanDelete extends Main {
    public Boolean deleteIlan() {
        System.out.println("\nSileceğiniz ilanınızın id'sini giriniz..");
        boolean kontrol = true;
        int secim = 0;
        while (kontrol) {
            try {
                secim = scanner.nextInt();
                kontrol = false;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Bir Hata Oluştu...");
                System.out.println("Lütfen Tekrar Deneyiniz...");
                System.out.println("\nSileceğiniz ilanınızın id'sini giriniz..");
            }
        }
        int i=0;
        for (Ilan ilan : ilanlar.get(loginId).otomobiller) {
            if (secim == ilan.getIlanID()) {
                ilanlar.get(loginId).otomobiller.remove(i);
                return true;
            }
            i++;
        }
        i=0;
        for (Ilan ilan : ilanlar.get(loginId).motosikletler) {
            if (secim == ilan.getIlanID()) {
                ilanlar.get(loginId).motosikletler.remove(i);
                return true;
            }
            i++;
        }
        i=0;
        for (Ilan ilan : ilanlar.get(loginId).daireler) {
            if (secim == ilan.getIlanID()) {
                ilanlar.get(loginId).daireler.remove(i);
                return true;
            }
            i++;
        }
        for (Ilan ilan : ilanlar.get(loginId).arsalar) {
            if (secim == ilan.getIlanID()) {
                ilanlar.get(loginId).arsalar.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }
}