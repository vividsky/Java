package GenericTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
    private class Node {
        private int data;
        private ArrayList<Node> children;

         Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }
    private Node root;
    private int size;
    public GenericTree() {

    }
    private void takeInput(Scanner sc,Node parent, int data) {
        sc = new Scanner(System.in);
        if(parent == null) {
            System.out.println("Enter data for root node");

        } else {
            System.out.println();
        }
        this.root.data = sc.nextInt();
    }

}
