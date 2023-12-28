public class Binary_Tree_BTS {
    node root;
    public Binary_Tree_BTS(){
        root=null;
    }
    node newNode(int data){
        root=new node(data);
        System.out.println(data+ " Ağaca eklendi");
        return root;
    }
    node insert(node root,int data){
        if (root!=null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }else{
           root=newNode(data);
        }return root;
    }
}
