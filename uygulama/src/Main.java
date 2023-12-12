import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        tek_yonlu_liste teklist=new tek_yonlu_liste();
        int secim=1;
        Scanner scanner=new Scanner(System.in);
        int sayi,indis ;
        while (secim!=0){
            System.out.println("1 basa ekle");
            System.out.println("2 sona ekle");
            System.out.println("3 araya ekle");
            System.out.println("4 baştan sil");
            System.out.println("5 sondan sil");
            System.out.println("6 aradan sil");
            System.out.println(" 0 çıkış ");
            System.out.println("Seçiminiz:");
            secim=scanner.nextInt();

            if (secim==1){
                System.out.println("sayı : ");
                sayi=scanner.nextInt();
                teklist.basaekle(sayi);
            } else if (secim==2) {
                System.out.println("sayı : ");
                sayi=scanner.nextInt();
                teklist.sonaekle(sayi);
                
            }
            else if (secim==3) {
                System.out.println("sayı : ");
                sayi=scanner.nextInt();
                System.out.println("indis : ");
                indis=scanner.nextInt();
                teklist.arayaekle(indis,sayi);
                
            } 
            else if (secim==4) {
                teklist.bastansil();

            }
            else if (secim==5) {
                teklist.sondansil();

            } 
            else if (secim==6) {
                    System.out.println("indis : ");
                    indis=scanner.nextInt();
                    teklist.aradansil(indis);

            } else if (secim==0) {
                System.out.println("Program sonlandırıldı.....");
                
            }else {
                System.out.println("hatalı seçim yaptınız!" );

            }
            teklist.yazdir();
            


        }


    }
}