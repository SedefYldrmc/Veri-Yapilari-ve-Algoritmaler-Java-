import java.util.Scanner;

public class Uygulamasi {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        bagli_liste list= new bagli_liste();
        int secim=-1;
        while (secim!=0){
            System.out.println("1- Ekle     : ");
            System.out.println("2- Sil      : ");
            System.out.println("3- Güncelle : ");
            System.out.println("4- Müsteri Ara: ");
            System.out.println("5- Yazdır     : ");
            System.out.println("0-Çıkış  : ");
            System.out.println("Seçiminiz: ");
            secim=scanner.nextInt();
            scanner.nextLine();
            switch (secim){
                case 1:list.ekle();break;
                case 2:list.sil();break;
                case 3:list.guncelle();break;
                case 4:list.musteriAra();break;
                case 5:list.yazdir();break;
                case 0:System.out.println("Çıkış yaptınız:");break;
                default:System.out.println("Hatalı seçim yaptınız![0-5]");break;

            }

        }
    }
}