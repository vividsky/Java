package Recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "a";
        System.out.println(permutations(str));
    }
    public static ArrayList permutations(String str) {
        if(str.length() == 1) {
            ArrayList<String> demo = new ArrayList<>();
            demo.add(str);
            return demo;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = permutations(ros);
        for (String ele: recResult) {
            for(int i = 0; i <= ele.length(); i++) {
                myResult.add(ele.substring(0,i) + cc + ele.substring(i));
            }
        }
        return myResult;
    }

}

