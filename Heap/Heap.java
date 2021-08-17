package Heap;

import java.util.ArrayList;

public class Heap {

    ArrayList<Integer> arr = new ArrayList<>();

    public void demo(ArrayList arr, int a, int b) {
        if ((int) arr.get(a) < (int) arr.get(b));
    }

    public void insert(int ele) {
        arr.add(ele);
        upHeapify(arr.size() - 1);
    }
    private void upHeapify(int ci) {
        int pi = (ci - 1)/2;
        if (arr.get(ci) < arr.get(pi)) {
            swap(ci, pi);
            upHeapify(pi);
        }
    }
    private void swap(int ci, int pi) {
        int temp =  arr.get(ci);
        arr.set(ci, arr.get(pi));
        arr.set(pi, temp);
    }
    public int size() {
        return arr.size();
    }
    public boolean isEmpty() {
        return arr.size() == 0;
    }

    public void display() {
        System.out.println(arr);
    }
    public int remove  () {
        int root = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.remove(arr.size() - 1);
        downHeapify(0);
        return root;
    }
    private void downHeapify(int pi) {
        int lci = 2*pi + 1;
        int rci = 2*pi + 2;
        int min = pi;
        if (lci < arr.size() && arr.get(lci) < arr.get(min)) {
            min = lci;
        }
        if (rci < arr.size() && arr.get(rci) < arr.get(min)) {
            min = rci;
        }
        if (min != pi) {
            swap(min, pi);
            downHeapify(min);
        }

    }
    public int get(){
        return arr.get(0);
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(2);
        heap.insert(3);
        heap.insert(5);
        heap.insert(4);
        heap.insert(1);
        heap.insert(10);
        heap.insert(7);
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
    }

}
