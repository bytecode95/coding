package datastructure.tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Node tree = new Node();
//        tree.populate(scanner);
//        tree.display();

        BST tree = new BST();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();

        //sorted array
//        int[] nums = {1,2,4,6,8,9,10,13,15,17};
//        tree.populate(nums);
//        tree.display();


    }
}
