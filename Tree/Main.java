package Tree;

public class Main {
    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();
//        for(int i = 10; i >= 0; i-- ){
//            binaryTree.insert(i);
//        }
        binaryTree.insert(50);
        binaryTree.insert(20);
        binaryTree.insert(80);
        binaryTree.insert(10);
        binaryTree.insert(30);
        binaryTree.insert(60);
        binaryTree.insert(90);
        binaryTree.insert(25);
        binaryTree.insert(85);
        binaryTree.insert(100);
        System.out.println("中序遍历：");
        binaryTree.infixOrder(binaryTree.root);
        System.out.println("");
        System.out.println("前序遍历：");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("");
        System.out.println("后序遍历：");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("");
//        System.out.println("查找：8");
//        System.out.println(binaryTree.find(8) + " " + binaryTree.find(8).data);
        System.out.println("");
        System.out.println("查找最小值：");
        System.out.println(binaryTree.findMin().data);
        System.out.println("");
        System.out.println("查找最大值：");
        System.out.println(binaryTree.fidMax().data);
        System.out.println("");
        System.out.println("删除节点：");
        System.out.println(binaryTree.delete(30));
        System.out.println("");
        System.out.println("前序遍历：");
        binaryTree.preOrder(binaryTree.root);
    }

}
