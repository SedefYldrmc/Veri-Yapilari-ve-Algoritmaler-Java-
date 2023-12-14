import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        int secim=-1;
        ogr_liste bilBolum=new ogr_liste();
        Scanner scanner=new Scanner(System.in);
        while (secim!=0){
            System.out.println("Bilgisayar bölümü öğrenci kayıt uygulaması");
            System.out.println("1- yeni kayıt");
            System.out.println("2- kayıt sil");
            System.out.println("3- kayıtları listele");
            System.out.println("4- en başarılı öğrenci bilgileri");
            System.out.println("01- çıkış");
            System.out.println("Seçiminiz");
            secim=scanner.nextInt();
            if (secim==1){
                bilBolum.ekle();
            } else if (secim==2) {
                bilBolum.sil();

            } else if (secim==3) {
                bilBolum.yazdır();
            } else if (secim==4) {
                bilBolum.en_basasrili_ogrenci();
            } else if (secim==0) {
                System.out.println("Programı sonlandırdınız......");

            } else {
                System.out.println("Hatalı seçim yaptınız [0,4]");
            }

        }

    }
}