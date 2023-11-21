package datastructure.tree;

public class BST {
    public class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public BST() {

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
    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(value, node.left);
        }

        if(value>node.value){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return node;
    }

    public boolean balanaced(){
        return balanaced(root);
    }

    private boolean balanaced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanaced(node.left) && balanaced(node.right);
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void display(){
        display(root, "Root Node: ");
    }

    public void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value+" : ");
        display(node.right, "Right child of " + node.value+" : ");
    }

}
