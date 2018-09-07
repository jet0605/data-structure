package Tree;

public class BinaryTree implements Tree{
    Node root;
    @Override
    public Node find(int key) {
        Node current = root;
        while(current != null){
            if(current.data > key){
                current = current.leftChild;
            }else if(current.data < key){
                current = current.rightChild;
            }else{
                return current;
            }
        }
        return null;
    }

    @Override
    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return true;
        }else{
            Node currentNode = root;
            Node parentNode = null;
            while(currentNode != null){
                parentNode = currentNode;
                if(currentNode.data > newNode.data){
                    currentNode = currentNode.leftChild;
                    if(currentNode == null){
                        parentNode.leftChild = newNode;
                        return true;
                    }
                }else{
                    currentNode = currentNode.rightChild;
                    if(currentNode == null){
                        parentNode.rightChild = newNode;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Node fidMax() {
        Node current = root;
        if(current != null){
            while(current.rightChild != null){
                current = current.rightChild;
            }
        }
        return current;
    }

    @Override
    public Node findMin() {
        Node current = root;
        if(current != null){
            while(current.leftChild != null){
                current = current.leftChild;
            }
        }
        return current;
    }

    @Override
    public boolean delete(int key) {
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = false;
        //第一种情况删除节点是没有左右子树
        while(currentNode.data != key){
            parentNode = currentNode;
            if(currentNode.data > key){
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            }else if(currentNode.data < key){
                isLeftChild = false;
                currentNode = currentNode.rightChild;
            }
            if(currentNode == null){
                return false;
            }
        }

        //如果当前节点没有左右子树
        if(currentNode.leftChild == null && currentNode.rightChild == null){
            if(currentNode == root){
                root = null;
            }else if(isLeftChild){
                parentNode.leftChild = null;
            }else{
                parentNode.rightChild = null;
            }
            return true;
        }
        //如果删除的节点有一个子树
        if(currentNode.leftChild == null && currentNode.rightChild != null){
            if(currentNode == root){
                root = currentNode.rightChild;
            }else if(isLeftChild){
                parentNode.leftChild = currentNode.rightChild;
            }else{
                parentNode.rightChild = currentNode.rightChild;
            }
            System.out.println("1");
            return true;
        }
        if(currentNode.leftChild != null && currentNode.rightChild == null){
                if(currentNode == root){
                    root = currentNode.leftChild;
                }else if(isLeftChild){
                    parentNode.leftChild = currentNode.leftChild;
                }else{
                    parentNode.rightChild = currentNode.rightChild;
                }
            System.out.println("2");
                return true;
        }
        //删除节点存在两个节点
        if(currentNode.rightChild != null && currentNode.leftChild != null){
            Node successorNode = getSuccessor(currentNode);
            if(currentNode == root){
                successorNode = root;
            }else if(isLeftChild){
                parentNode.leftChild = successorNode;
            }else{
                parentNode.rightChild = successorNode;
            }
            return true;
        }
        return false;
    }

    public Node getSuccessor(Node delNode){
        Node successorParentNode = delNode;
        Node successorNode = delNode;
        Node currentNode = delNode.rightChild;
        while(currentNode != null){
            successorParentNode = successorNode;
            successorNode = currentNode;
            currentNode = currentNode.leftChild;
        }
        //如果后继节点不是存在与删除节点的右节点上(意思就是只有一个右节点或者没有)
        if(successorNode !=  delNode.rightChild){
            successorParentNode.leftChild = successorParentNode.rightChild;
            successorParentNode.rightChild = delNode.rightChild;
        }
        return successorNode;
    }

    @Override
    public void postOrder(Node current) {
        if(current != null){
            postOrder(current.leftChild);
            postOrder(current.rightChild);
            System.out.print(current.data + " ");
        }
    }

    @Override
    public void preOrder(Node current) {
        if(current != null){
            System.out.print(current.data + " ");
            preOrder(current.leftChild);
            preOrder(current.rightChild);
        }
    }

    @Override
    public void infixOrder(Node current) {
        if(current != null){
            infixOrder(current.leftChild);
            System.out.print(current.data + " ");
            infixOrder(current.rightChild);
        }
    }
}
