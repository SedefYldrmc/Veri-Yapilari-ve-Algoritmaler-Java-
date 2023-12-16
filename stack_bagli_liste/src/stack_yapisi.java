public class stack_yapisi {
    int size;
    int cnt;
    node top;     //en üst düğümü tutan gösterici(head a benzer)
    public stack_yapisi(int size){
        this.size=size;
        cnt=0;
        top=null;
    }
    void push(int data){ //ekleme
        node eleman=new node(data);
        if (isFull()){
            System.out.println("Stack dolu!! Ekleme yapılamadı.");
        }else{
            if (isEmpty()){
                top=eleman;
                System.out.println(top.data+ " stacke ilk eleman olarak eklendi.");
            }else {
                eleman.next=top;
                top=eleman;
                System.out.println(top.data+" stake eklendi.");
            }
            cnt++;
        }

    }
    void pop(){ //cikarma
        if (isEmpty()){
            System.out.println("Stack zaten bos!! Çikarma yapılamadı");
        }else{
            System.out.println( top.data +" çıkarıldı");
            top=top.next;
            cnt--;
        }

    }
    boolean isFull(){ //  dolu mu?
        return cnt==size;
    }
    boolean isEmpty(){ //boş mu?
         return cnt==0;
    }
    void topGoster(){
        if (isEmpty()){
            System.out.println("stack boş!");
        }else{
            System.out.println("En üstteki düğüm datasi = "+top.data);
        }
    }
    void print(){
        if (isEmpty()){
            System.out.println("Stack boş.yazdırılacak birşey bulunamadı");
        }else {
            node temp=top;
            System.out.println("stackteki veriler\n");
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }System.out.println("\n");

        }
    }
}
