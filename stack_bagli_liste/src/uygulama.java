import java.util.Scanner;

public class uygulama {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Stack yapısını kaç eleman girmek istersiniz?");
        int n=scanner.nextInt();
        stack_yapisi list=new stack_yapisi(n);


        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(10);
        list.push(10);
        list.push(10);
        list.push(10);
        list.push(10);
        list.print();
        list.pop();
        int secim=-1,sayi;
        while (secim!=0){
            System.out.println("1-Ekle");
            System.out.println("2-Çikar");
            System.out.println("3-En üstekini göster");
            System.out.println("4-Yazdır");
            System.out.println("0-çikiş");
            System.out.println("Seçim:");
            secim=scanner.nextInt();
        }switch (secim){
            case 1:System.out.println("sayi: ");sayi=scanner.nextInt();
            list.push(sayi);break;
            case 2 :list.pop();break;
            case 3:list.topGoster();break;
            case 4:list.print();break;
            case 0:System.out.println("Çıkış Yaptınız:)");
            default:System.out.println("Hatalı seçim[0-4]!!");break;
        }
    }
}