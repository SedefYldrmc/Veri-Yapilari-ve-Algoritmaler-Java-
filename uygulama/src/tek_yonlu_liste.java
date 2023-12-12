public class tek_yonlu_liste {
    node head=null;
    node tail=null;

    void basaekle(int x){
        node eleman= new node();
        eleman.data=x;
        if (head==null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste oluşturuldu ilk eleman eklendi");
        }else{
            eleman.next=head;
            head=eleman;
            System.out.println("listenin basina elaman eklendi");
        }
    }
    void sonaekle(int x){
        node eleman= new node();
        eleman.data=x;
        if (head==null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste oluşturuldu ilk eleman eklendi");
        }else{
            eleman.next=null;
            tail.next=eleman;// ekleme yaptık
            tail=eleman; //kuyruğu güncelledik
            System.out.println("listenin sonuna elaman eklendi");
        }
    }
    void yazdir(){

        if (head==null){

            System.out.println("liste bos!!!");
        }else{
            node temp=head;
            System.out.print( "bas ->");
            while (temp!=null){

            System.out.print(temp.data + "->");
            temp=temp.next;
            }
            System.out.print( "son ->");
        }
    }
    public void arayaekle( int indis,int x){
        node eleman= new node();
        eleman.data=x;
        if (head==null && indis==0){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste oluşturuldu ilk eleman eklendi");
        } else if (head!=null && indis==0) {
            eleman.next=head;
            head=eleman;
            System.out.println(indis+ " indisinci sıraya yeni  eleman eklandi");
            
        } else{
            int n=0;
            node temp=head;
            node temp2=head;
            while (temp.next!=null){
                n++;
                temp2=temp;
                temp=temp.next;
            }
            if (n==indis){
                temp2.next=eleman;
                eleman.next=temp;
                System.out.println("eleman eklendi ");
            }
            else{
                temp=head;
                temp2=head;
                int i=0;
                while (i<=indis){
                    temp2=temp;
                    temp=temp.next;
                    i++;
                }
                temp2.next=eleman;
                eleman.next=temp;
                System.out.println(indis +". sıraya eleman eklendi.");
            }

        }

    }
    public void bastansil(){
        if (head==null){
            System.out.println("listede silinecek bişey bulunmamaktdır");
        } else if (head.next==null) {
            head=null;
            tail=null;
            System.out.println("listede kalan son elemanda siindi");
        }
        else {
            head=head.next;
            System.out.println("Bastaki eleman silindi");
        }

    }
    public void sondansil(){
        if (head==null){
            System.out.println("listede silinecek bişey bulunmamaktdır");
        } else if (head.next==null) {
            head=null;
            tail=null;
            System.out.println("listede kalan son elemanda siindi");
        }
        else {
            node temp =head;
            node temp2=head;
            while (temp.next!=null){
                temp2=temp;
                temp=temp.next;
            }
            temp2.next=null;
            tail=temp2;
            System.out.println("sondan eleman silindi.");


        }
    }
    public void aradansil(int indis){
        if (head==null){
            System.out.println("liste boş, silinecek bişey yok!!!!");
        } else if (head.next==null && indis==0) {
            head=null;
            tail=null;
            System.out.println("listenin kaln son elemanıda silindi");
            
        }else if (head.next!=null && indis==0){
            head=head.next;
            System.out.println("Bastaki eleman silindi");

        }else {
            int i=0;
            node temp=head;
            node temp2=head;
            while (temp!=null){
                i++;
                temp2=temp;
                temp=temp.next;
            }
            if (i==indis){
                temp2.next=null;
                tail=temp2;
                System.out.println("listedeki son sıradaki eleman  silindi.");
            }
            else {
                temp=head;
                temp2=head;
                int j=0;

               while (j!=0){
                   temp2=temp;
                   temp=temp.next;
                   j++;
               }
               temp2.next=temp.next;
               System.out.println("aradaki nesne silidi");
            }
        }
    }

}
