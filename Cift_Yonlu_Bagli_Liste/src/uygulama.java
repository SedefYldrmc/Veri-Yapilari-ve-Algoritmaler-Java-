import java.util.Scanner;

public class uygulama {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        bagli_Liste bl=new bagli_Liste();
       int secim=-1,sayi,indis;
       while (secim!=0){
           System.out.println("1- basa ekle");
           System.out.println("2- sona ekle");
           System.out.println("3-sondan başa yazdır");
           System.out.println("4- araya eleman ekleme");
           System.out.println("5- bastan eleman silme");
           System.out.println("6- sondan eleman silme");
           System.out.println("7- aradan eleman silme");
           System.out.println("0- çikiş ");
           System.out.println("seçiminiz : ");
           secim=scanner.nextInt();
           if (secim==1 ){
               System.out.print("sayı : ");
               sayi=scanner.nextInt();
               bl.basaekle(sayi);
           }
           else if (secim==2){
               System.out.print("sayı : ");
               sayi=scanner.nextInt();
               bl.sonaekle(sayi);}
           else if (secim==3) {
               bl.sondanbasayazdir();
           }
           else if(secim==4) {
               System.out.print("indis : ");
               indis=scanner.nextInt();

               System.out.print("sayi : ");
               sayi=scanner.nextInt();

               bl.araekle(indis,sayi);
           } else if (secim==5) {
               bl.bastansil();
           } else if (secim==6) {
               bl.sondansil();
           }else if (secim==7) {
               System.out.print("indis : ");
               indis=scanner.nextInt();
               bl.aradansilme(indis);
           }
           bl.yazdir();
       }


    }
}