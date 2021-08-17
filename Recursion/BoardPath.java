package Recursion;

import java.util.ArrayList;

public class BoardPath {
    public static void main(String[] args) {
        System.out.println(boardPath(0, 10).size());
    }
    public static ArrayList boardPath( int start, int end) {
        if (start > end) {
            return new ArrayList();
        }
        if (start == end) {
            ArrayList<String> demo = new ArrayList<>();
            demo.add("");
            return demo;
        }
        ArrayList<String> myResult = new ArrayList();
        for(int i = 1; i <=6; i++) {
            ArrayList<String> recResult =  boardPath(start+i, end);
            for(String ele:recResult) {
                myResult.add(i + ele);
            }
        }
        return myResult;
    }
}
