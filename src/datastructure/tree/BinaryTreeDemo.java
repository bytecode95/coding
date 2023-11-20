package datastructure.tree;

import java.util.Scanner;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node tree = new Node();
        tree.populate(scanner);
        tree.display();

    }
}
