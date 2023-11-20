package datastructure.tree;

import java.util.Scanner;

public class Node {
    int value;
    Node left;
    Node right;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    Node root;
    //insert Elements
    public void populate(Scanner scanner){
        System.out.print("Enter the root Node: ");
       int value = scanner.nextInt();
       root = new Node(value);
       populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.print("Do you want to enter left of "+ node.value+" : ");
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.print("Enter the value of the left: "+ node.value+" : ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.print("Do you want to enter right of "+ node.value+" : ");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.print("Enter the value of the right: "+ node.value+" : ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {
        if(node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent+"\t");
    }


}
