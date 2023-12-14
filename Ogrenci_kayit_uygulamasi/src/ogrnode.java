public class ogrnode {
    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;
    ogrnode next;
    public ogrnode( int numara,String ad,String soyad,int vize,int fin){
        this.ad=ad;
        this.soyad=soyad;
        this.numara=numara;
        this.vize=vize;
        this.fin=fin;

        ortalama=vize*0.4+vize*0.6;
        if (ortalama>= 50){
            durum="Geçti";
        }else {
            durum="Kaldı";
        }
        next=null;

    }
}





