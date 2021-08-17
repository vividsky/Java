package LinkedList;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class midNodeOfLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i = 0; i < size; i++) {
            ll.add(sc.nextInt());
        }

    }

}
