public class IlanCreate extends Main {
    public void otomobilCreate() {
        boolean check = true;
        while (check)
        {
            String baslik, aciklama, marka, model, vitesTipi, renk, kasa, yakit, cekis;
            int fiyat, uretimYili;

            System.out.println("Otomobil İlanı Oluşturmaktasınız.\n\n");
            while (true)
            {
                System.out.println("İlan Başlığı: ");
                baslik = scanner.next();
                if (new IlanQuery(baslik).createQuery())
                {
                    continue;
                }
                else
                {
                    break;
                }
            }

            System.out.print("İlan Açıklaması: ");
            aciklama = scanner.next();
            System.out.print("Otomobil Markası: ");
            marka = scanner.next();
            System.out.print("Otomobil Modeli: ");
            model = scanner.next();
            System.out.print("Otomobil Üretim Yılı: ");
            uretimYili = scanner.nextInt();
            System.out.print("Otomobil Vites Tipi: ");
            vitesTipi = scanner.next();
            System.out.print("Otomobil Rengini Giriniz: ");
            renk = scanner.next();
            System.out.print("Otomobil Kasa Tipi: ");
            kasa = scanner.next();
            System.out.print("Otomobil Yakıt Tipi: ");
            yakit = scanner.next();
            System.out.print("Otomobil Çekiş Türünü: ");
            cekis = scanner.next();
            System.out.print("Satış Fiyatınızı Giriniz: ");
            fiyat = scanner.nextInt();
            ilanlar.get(loginId).otomobiller.add(new Otomobil(ilanKayitId, loginId, baslik, aciklama, fiyat, marka, model, vitesTipi, renk, uretimYili, kasa, yakit, cekis));
            check = false;
            ilanKayitId++;
        }
    }

    public void MotosikletCreate() {
        boolean check = true;

        String baslik, aciklama, marka, model, vitesTipi, renk, motorTip;
        int fiyat, uretimYili, motorHacim;

        while (check)
        {
            System.out.println("Motosiklet İlanı Oluşturmaktasınız.\n\n");
            while (true)
            {
                System.out.println("İlan Başlığı: ");
                baslik = scanner.next();
                if (new IlanQuery(baslik).createQuery())
                {
                    continue;
                }
                else
                {
                    break;
                }
            }

            System.out.print("İlan Açıklaması: ");
            aciklama = scanner.next();
            System.out.print("Motosiklet Markası: ");
            marka = scanner.next();
            System.out.print("Motosiklet Modeli: ");
            model = scanner.next();
            System.out.print("Motosiklet Üretim Yılı: ");
            uretimYili = scanner.nextInt();
            System.out.print("Motosiklet Vites Tipi: ");
            vitesTipi = scanner.next();
            System.out.print("Motosiklet Rengini Giriniz: ");
            renk = scanner.next();
            System.out.print("Motosiklet Motor Hacmi: ");
            motorHacim = scanner.nextInt();
            System.out.print("Motosiklet Motor Tipi: ");
            motorTip = scanner.next();
            System.out.print("Satış Fiyatınızı Giriniz: ");
            fiyat = scanner.nextInt();
            ilanlar.get(loginId).motosikletler.add(new Motosiklet(ilanKayitId, loginId, baslik, aciklama, fiyat, marka, model, vitesTipi, renk, uretimYili, motorHacim, motorTip));
            ilanKayitId++;
            check = false;
        }
    }

    public void daireCreate() {

        String baslik, aciklama, odaSayisi, isitma, adres;
        int fiyat, mkare, binaYas, katSayisi, aidat;
        boolean kredi;

        boolean check = true;
        while (check)
        {
            System.out.println("Daire İlanı Oluşturmaktasınız.\n\n");
            while (true)
            {
                System.out.println("İlan Başlığı: ");
                baslik = scanner.next();
                if (new IlanQuery(baslik).createQuery())
                {
                    continue;
                }
                else
                {
                    break;
                }
            }

            System.out.println("İlanınızın Açıklamasını Giriniz: ");
            aciklama = scanner.next();
            System.out.println("Dairenizin Oda Sayısını Giriniz: ");
            odaSayisi = scanner.next();
            System.out.println("Dairenizin Isıtma Şekli: ");
            isitma = scanner.next();
            System.out.println("Dairenizin Adresi: ");
            adres = scanner.next();
            System.out.println("Dairenizin Metrekaresini Giriniz: ");
            mkare = scanner.nextInt();
            System.out.println("Dairenizin Bulunduğu Bina Yaşı: ");
            binaYas = scanner.nextInt();
            System.out.println("Dairenizin Kat Sayısı: ");
            katSayisi = scanner.nextInt();
            System.out.println("Dairenizin Bulunduğu Binanın Aidatı : ");
            aidat = scanner.nextInt();
            System.out.println("Dairenizin Krediye Uygunluk Durumu: ");
            kredi = scanner.nextBoolean();
            System.out.println("Dairenizin Fiyatı: ");
            fiyat = scanner.nextInt();
            ilanlar.get(loginId).daireler.add(new Daire(ilanKayitId, loginId, baslik, aciklama, fiyat, mkare, kredi, odaSayisi, isitma, adres, binaYas, katSayisi, aidat));
            ilanKayitId++;
            check = false;
        }
    }

    public void arsaCreate() {

        String baslik, aciklama, imarDurum;
        int fiyat, mkare, mkareFiyat;
        boolean kredi;
        boolean check = true;
        while (check) {

            System.out.println("Daire İlanı Oluşturmaktasınız.\n\n");
            while (true)
            {
                System.out.println("İlan Başlığı: ");
                baslik = scanner.next();
                if (new IlanQuery(baslik).createQuery())
                {
                    continue;
                } else
                {
                    break;
                }
            }

            System.out.println("İlanınızın Açıklamasını Giriniz: ");
            aciklama = scanner.next();
            System.out.println("Arsanızın İmar Durumunu Giriniz: ");
            imarDurum = scanner.next();
            System.out.println("Dairenizin Metrekaresini Giriniz: ");
            mkare = scanner.nextInt();
            System.out.println("Dairenizin Krediye Uygunluk Durumu: ");
            kredi = scanner.nextBoolean();
            System.out.println("Dairenizin Fiyatı: ");
            fiyat = scanner.nextInt();
            mkareFiyat = fiyat / mkare;
            ilanlar.get(loginId).arsalar.add(new Arsa(ilanKayitId, loginId, baslik, aciklama, fiyat, mkare, kredi, mkareFiyat, imarDurum));
            ilanKayitId++;
            check = false;
        }

    }

}

