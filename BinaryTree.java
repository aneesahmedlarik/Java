package DataStructure;

public class BinaryTree {

    Node root;
    public class Node{
        int data;
        Node right,left;

    Node(int data){
    this.data=data;
    }
    }
    public void insert(int value){
        root= insert(root,value);

    }
    public Node insert(Node root,int value){
        if(root==null){
            root= new Node(value);
return root;    }
        if(value<root.data){

            root.left=insert(root.left,value);

        }
else{
        root.right=insert(root.right,value);
        }
return root;

    }
    public void Inorder(Node root){
if(root==null){
    return;
}
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);

    }



    public static void main(String[] args) {
        BinaryTree bt= new BinaryTree();
        bt.insert(5);
        bt.insert(3);
        bt.insert(7);
        bt.insert(4);
        bt.insert(2);
        bt.Inorder(bt.root);


    }
}
