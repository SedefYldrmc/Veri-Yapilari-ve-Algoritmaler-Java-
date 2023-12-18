import java.util.Scanner;

public class bagli_liste {
    musterinode head;
    musterinode tail;

    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;
     public bagli_liste(){
         head=null;
         tail=null;
     }
     Scanner scanner=new Scanner(System.in);
     void ekle(){
         System.out.println("Müşterinin bilgilerini giriniz:");
         System.out.println("numarası  :");id=scanner.nextInt();
         scanner.nextLine();
         System.out.println("adı       :");ad=scanner.nextLine();
         System.out.println("soyadı    :");soyad=scanner.nextLine();
         System.out.println("telefon   :");tel=scanner.nextLine();
         System.out.println("adresi    :");adres=scanner.nextLine();
         System.out.println("urun      :");urun=scanner.nextLine();

         musterinode eleman=new musterinode(id,ad,soyad,tel,adres,urun);

         if(head==null){
             head=eleman;
             tail=eleman;
             System.out.println("Liste olusturuldu.İlk müşteri kayıt edildi");
         }else {
             eleman.next=head;
             head.prev=eleman;
             head=eleman;
             System.out.println(id +" numaralı müşteri kayıt edildi");
         }
     }
     void sil(){
         boolean sonuc=false;
         if(head==null){
             System.out.println("Liste boş.Silinecek eleman yok");
             sonuc=false;
         }else {
             System.out.println(" Silinecek müşterinin bilgilerini giriniz:");
             System.out.println("numarası  :");id=scanner.nextInt();
             scanner.nextLine();
             if(head.next==null && head.id==id){
                 head=null;
                 tail=null;
                 System.out.println("Listedeki tek eleman silindi");
                 sonuc=true;
             } else if (head.next!=null && head.id==id) {
                 head=head.next;
                 head.prev=null;
                 System.out.println(id + " numaralı müşteri silindi.");
                 sonuc=true;
             } else if (tail.id==id) {
                 tail=tail.prev;
                 tail.next=null;
                 System.out.println(id + " numaralı müşteri silindi.");
                 sonuc=true;
             }else{
                 musterinode temp=head;
                 while (temp!=null){
                     if (temp.id==id){
                         temp.next.prev=temp.prev;
                         temp.prev.next=temp.next;
                         System.out.println(id + " numaralı müşteri silindi.");
                         sonuc=true;
                         break;
                     }
                 }temp=temp.next;

             }
         }
         if (!sonuc){
             System.out.println(id +" Numaralı bir  müsteri yok!!");
         }
     }
     void guncelle(){
         boolean sonuc=false;
         if(head==null)
             System.out.println("Liste boş.guncellenecek eleman yok");

         else {
             System.out.println(" Guncellenecek müşterinin bilgilerini giriniz:");
             System.out.println("numarası  :");
             id = scanner.nextInt();
             scanner.nextLine();

             musterinode temp = head;
             while (temp != null) {
                 if (temp.id == id) {

                     System.out.println(id + " numaralı müşteri  bilgileri:");
                     System.out.println("ad        :" + temp.ad);
                     System.out.println("soyad     :" + temp.soyad);
                     System.out.println("tel       :" + temp.tel);
                     System.out.println("adres     :" + temp.adres);
                     System.out.println("urun      :" + temp.urun);
                     System.out.println("Ürun bilgilerini güncelleyiniz:  " + temp.urun);
                     temp.urun=scanner.nextLine();
                     System.out.println("Ürün bilgisi güncellendi.");
                     sonuc = true;
                     break;
                 }
             }
             temp = temp.next;
         }
     }
    void musteriAra(){
        boolean sonuc=false;
        if(head==null)
            System.out.println("Liste boş. eleman yok");

        else {
            System.out.println(" Aranacak müşterinin bilgilerini giriniz:");
            System.out.println("numarası  :");
            id = scanner.nextInt();
            scanner.nextLine();

            musterinode temp = head;
            while (temp != null) {
                if (temp.id == id) {

                    System.out.println(id + " numaralı müşteri  bilgileri:");
                    System.out.println("ad        :" + temp.ad);
                    System.out.println("soyad     :" + temp.soyad);
                    System.out.println("tel       :" + temp.tel);
                    System.out.println("adres     :" + temp.adres);
                    System.out.println("urun      :" + temp.urun);

                    sonuc = true;
                    break;
                }
            }
            temp = temp.next;
        }
    }
    void yazdir(){
        if(head==null)
            System.out.println("Liste boş. eleman yok");

        else {
            System.out.println("Numara\tAd\tSoyad\tTelefon\tAdres\türün\n");
            musterinode temp = head;
            while (temp != null) {

                    System.out.println(temp.id+"\t"+temp.soyad+"\t"+temp.tel+"\t"+temp.adres+"\t"+temp.urun);
                temp = temp.next;


            }


        }
    }





}
