package datastructure.tree;

class BinarySearchTree {
    public class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    Node root;

    public BinarySearchTree() {

    }

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }


    public void display(){
        display(root, "Root Node: ");
    }

    public void display(Node node, String details){
        if(node==null){
            return;
        }
        display(node.left, "Left child of " + node.value+" : ");
        display(node.right, "Right child of " + node.value+" : ");
    }

}
