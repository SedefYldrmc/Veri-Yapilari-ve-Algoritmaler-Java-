public class bagli_Liste {
    //Çift yönlü doğrusal bağlı liste;
    node head=null;
    node tail=null;

    void basaekle(int data){
        node elaman=new node(data);
        if (head==null){
            head=elaman;
            tail=elaman;
        } else {
            elaman.next=head;
            head.prev=elaman;
            head=elaman;
            
        }

    }
    void sonaekle(int data){
        node elaman=new node(data);
        if (head==null){
            head=elaman;
            tail=elaman;
        } else {
            tail.next=elaman;
            elaman.prev=tail;
            tail=elaman;


        }
    }
    void yazdir(){
        node temp=head;
        System.out.print("bas ");

        while (temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println(" son.");

    }
    void sondanbasayazdir(){
        node temp=tail;
        System.out.print("son->");

        while (temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.prev;
        }
        System.out.println(" ->baş.");

    }
    void araekle(int indis ,int data){
        node elaman=new node(data);
        if (head==null){
            head=elaman;
            tail=elaman;
        } else if (head!=null&& indis==0) {
            elaman.next=head;
            head.prev=head;
            head=elaman;
        }else{
            int n=0;
            node temp=head;
            while (temp!=null){
                temp=temp.next;
                n++;
            }
            temp=head;
            if (indis>n){
                tail.next=elaman;
                elaman.prev=tail;
                tail=elaman;
            }else{
                int i =0;
                while(i!=indis){
                    temp=temp.next;
                    i++;
                }
                elaman.prev=temp.prev;
                temp.prev.next=elaman;
                elaman.next=temp;
                temp.prev=elaman;
            }


        }
    }
    void bastansil(){
        if (head!=null){
           if (head.next==null){
               head=null;
               tail=null;

           }
           else {
              head=head.next;
              head.prev=null;
           }
        }
    }
    void sondansil(){
        if (head!=null){
            if (head.next==null){
                head=null;
                tail=null;

            }
            else {
                tail=tail.prev;
                tail.next=null;
            }
        }
    }
    void aradansilme(int indis){
        if (head!=null){
            if (head.next==null&& indis<=0){
                head=null;
                tail=null;

            } else if(head.next!=null && indis<=0) {
                head=head.next;
                head.prev=null;
            } else {
                int n =0;
                node temp=head;
                while (temp!=null){
                    n++;
                    temp=temp.next;

                }if (indis>=(n-1)){
                    tail=tail.prev;
                    tail.next=null;
                }else{
                    temp=head;
                    int i=0;
                    while(i<indis){
                        i++;
                        temp=temp.next;
                    }
                    temp.next.prev=temp.prev;
                    temp.prev.next=temp.next;

                }

            }
        }
    }
}
