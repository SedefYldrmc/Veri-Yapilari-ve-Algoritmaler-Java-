import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ogr_liste {
    ogrnode head = null;
    ogrnode tail = null;
    ogrnode temp = null;
    ogrnode temp2 = null;
    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;
    ogrnode next;
    Scanner scanner = new Scanner(System.in);

    void ekle() {
        System.out.println("Bilgsayar bölümüne kayıt olacak öğrenci bilgilerini giriniz.");
        System.out.println("numara: ");
        numara = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ad : ");
        ad = scanner.nextLine();
        System.out.println("soyad : ");
        soyad = scanner.nextLine();
        System.out.println("vize : ");
        vize = scanner.nextInt();
        System.out.println("fin: ");
        fin = scanner.nextInt();

        ogrnode eleman = new ogrnode(numara, ad, soyad, vize, fin);

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Bilgisayar Bölününe Kayıt olacak liste yapısı oluşturldu ");

        } else {
            eleman.next = head;
            head = eleman;
            System.out.println(numara + " numaralı öğrenci bölüme kayıt edildi.");

        }
    }

    void sil() {
        if (head == null) {
            System.out.println("liste boş, silinecek öğrenci yok!!!");
        } else {
            System.out.println("Liste istediğiniz öğrencinin numarsını giriniz:");
            numara = scanner.nextInt();

            if (numara == head.numara && head.next == null) {
                head = null;
                tail = null;
                System.out.println("listeden bir öğrenci silindi");
            } else if (numara == head.numara && head.next != null) {
                head = head.next;
                System.out.println(numara + "numaralı öğrenci silindi");
            } else {
                temp = head;
                temp2 = head;
                while (temp.next != null) {
                    if (numara == temp.numara) {
                        temp2.next = temp.next;
                        System.out.println(numara + "numaralı öğrenci silindi");
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if (numara == temp.numara) {
                    temp2.next = null;
                    tail = temp2;
                    System.out.println(numara + "numaralı öğrenci silindi");
                }
            }
        }
    }

    void yazdır() {
        if (head == null) {
            System.out.println("liste boşş!!");
        } else {
            temp = head;
            while (temp != null) {
                System.out.println(temp.numara + "  numaralı öğrenci bilgileri");
                System.out.println("******************************************");
                System.out.println("ad       :" + temp.ad);
                System.out.println("soyad    :" + temp.soyad);
                System.out.println("vize     :" + temp.vize);
                System.out.println("final    :" + temp.fin);
                System.out.println("ortalama :" + temp.ortalama);
                System.out.println("durum    :" + temp.durum);
                System.out.println("******************************************");
                temp = temp.next;
            }
        }

    }

    void en_basasrili_ogrenci(){
        if (head==null){
            System.out.println("liste boşş!!");
        }else {
            temp=head;
            double buyuk=temp.ortalama;
            while (temp!=null){
                if (buyuk<temp.ortalama){
                    buyuk=temp.ortalama;
                    numara= temp.numara;
                    ad=temp.ad;
                    soyad= temp.soyad;
                    vize=temp.vize;
                    fin= temp.fin;
                    ortalama=temp.ortalama;
                    durum=temp.durum;
                }
                temp=temp.next;
            }
            System.out.println("En basarılı öğrenci numaralı öğrenci bilgileri" );
            System.out.println("******************************************");
            System.out.println("ad       :"+ ad );
            System.out.println("soyad    :"+ soyad );
            System.out.println("vize     :"+vize );
            System.out.println("final    :"+fin );
            System.out.println("ortalama :"+ortalama );
            System.out.println("durum    :"+durum );
            System.out.println("******************************************");
        }
    }


}