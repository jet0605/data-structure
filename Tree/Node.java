package Tree;

/**
 * 二叉树节点类
 */
public class Node {
    int data;
    Node leftChild;
    Node rightChild;
    boolean isDelete;
    public Node(){}
    public Node(int data){this.data = data;}
    //打印节点内容
    public void display(){
        System.out.println(data);
    }
}
