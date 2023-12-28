public class uygulama {
    public static void main(String[] args) {
        Binary_Tree_BTS bt=new Binary_Tree_BTS();
        bt.root=bt.insert(bt.root,10);
        bt.root=bt.insert(bt.root,20);
        bt.root=bt.insert(bt.root,40);
        bt.root=bt.insert(bt.root,5);
        System.out.println("Kökün datasi= "+bt.root.data);
        System.out.println("Kökün sağindaki  datasi= "+bt.root.right.data);
        System.out.println("Kökün solundaki datasi= "+bt.root.left.data);
    }
}