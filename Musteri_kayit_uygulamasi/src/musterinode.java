public class musterinode { //Çift yönlü doğrusal Bağli liste
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;
    musterinode next;
    musterinode prev;
    public musterinode(int id,String ad,String soyad,String tel,String adres,String urun){
        this.ad=ad;
        this.soyad=soyad;
        this.id=id;
        this.tel=tel;
        this.adres=adres;
        this.urun=urun;
        next=null;
        prev=null;
    }


}
