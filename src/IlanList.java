public class IlanList extends Static {

    public void List() {
        for (Ilan ilan : ilanlar) {
            System.out.println("\n\n\nİlan ID: " + ilan.getIlanID());
            System.out.println("İlan Başlık: " + ilan.getBaslik());
            System.out.println("İlan Açıklaması: " + ilan.getAciklama());
            System.out.println("İlan Fiyat: " + ilan.getFiyat());
        }
    }

    public void ListUser() {
        for (Ilan ilan : ilanlar) {
            for (Otomobil otomobil : ilan.otomobiller) {
                if (otomobil.getUserID() == loginId) {
                    System.out.println("\n\n\nİlan ID: " + otomobil.getIlanID());
                    System.out.println("İlan Başlık: " + otomobil.getBaslik());
                    System.out.println("İlan Açıklaması: " + otomobil.getAciklama());
                    System.out.println("İlan Fiyat: " + otomobil.getFiyat());

                }
            }

            for (Motosiklet motosiklet : ilan.motosikletler){
                if (motosiklet.getUserID() == loginId)
                {
                    System.out.println("\n\n\nİlan ID: " + motosiklet.getIlanID());
                    System.out.println("İlan Başlık: " + motosiklet.getBaslik());
                    System.out.println("İlan Açıklaması: " + motosiklet.getAciklama());
                    System.out.println("İlan Fiyat: " + motosiklet.getFiyat());
                }
            }

            for (Daire daire : ilan.daireler) {
                if (daire.getUserID() == loginId) {
                    System.out.println("\n\n\nİlan ID: " + daire.getIlanID());
                    System.out.println("İlan Başlık: " + daire.getBaslik());
                    System.out.println("İlan Açıklaması: " + daire.getAciklama());
                    System.out.println("İlan Fiyat: " + daire.getFiyat());
                }
            }

            for (Arsa arsa : ilan.arsalar) {
                if (arsa.getUserID() == loginId) {
                    System.out.println("\n\n\nİlan ID: " + arsa.getIlanID());
                    System.out.println("İlan Başlık: " + arsa.getBaslik());
                    System.out.println("İlan Açıklaması: " + arsa.getAciklama());
                    System.out.println("İlan Fiyat: " + arsa.getFiyat());
                }
            }

        }
    }

    public void ListOtomobil() {
        for (int i = 0; i < ilanlar.size(); i++) {
            for (Otomobil otomobil : ilanlar.get(i).otomobiller) {
                System.out.println("****** OTOMOBİL İLANLARI ******");
                System.out.println("\n\n\nİlan ID: " + otomobil.getIlanID());
                System.out.println("İlan Başlık: " + otomobil.baslik);
                System.out.println("İlan Açıklaması: " + otomobil.aciklama);
                System.out.println("İlan Fiyat: " + otomobil.fiyat);
                System.out.println("Kullanıcı Telefon: " + users.get((otomobil.getUserID())).getPhone());
            }
        }

    }

    public void ListMotosiklet() {
        for (int i = 0; i < ilanlar.size(); i++) {
            for (Motosiklet motosiklet : ilanlar.get(i).motosikletler) {
                System.out.println("****** MOTOSİKLET İLANLARI ******");
                System.out.println("\n\n\nİlan ID: " + motosiklet.getIlanID());
                System.out.println("İlan Başlık: " + motosiklet.getBaslik());
                System.out.println("İlan Açıklaması: " + motosiklet.getAciklama());
                System.out.println("İlan Fiyat: " + motosiklet.getFiyat());
                System.out.println("Kullanıcı Telefon: " + users.get((motosiklet.getUserID())).getPhone());
            }
        }

    }

    public void ListDaire() {
        for (int i = 0; i < ilanlar.size(); i++) {
            for (Daire daire : ilanlar.get(i).daireler) {
                System.out.println("****** DAİRE İLANLARI ******");
                System.out.println("\n\n\nİlan ID: " + daire.getIlanID());
                System.out.println("İlan Başlık: " + daire.getBaslik());
                System.out.println("İlan Açıklaması: " + daire.getAciklama());
                System.out.println("İlan Fiyat: " + daire.getFiyat());
                System.out.println("Kullanıcı Telefon: " + users.get((daire.getUserID())).getPhone());
            }
        }

    }

    public void ListArsa() {
        for (int i = 0; i < ilanlar.size(); i++) {
            for (Arsa arsa : ilanlar.get(i).arsalar) {
                System.out.println("****** ARSA İLANLARI ******");
                System.out.println("\n\n\nİlan ID: " + arsa.getIlanID());
                System.out.println("İlan Başlık: " + arsa.getBaslik());
                System.out.println("İlan Açıklaması: " + arsa.getAciklama());
                System.out.println("İlan Fiyat: " + arsa.getFiyat());
                System.out.println("Kullanıcı Telefon: " + users.get((arsa.getUserID())).getPhone());
            }
        }

    }
}