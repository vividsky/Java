package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        String str = "ab";

        System.out.println(powerSetRecursive(str));
    }
    public static ArrayList powerSetIterative(String str, ArrayList<String> ans) {
        ans.add("");
        for (int i = 0; i < str.length(); i++) {
            ArrayList<String> demo = new ArrayList<>();
            for (String ele:ans) {
                ele+=str.charAt(i);
                demo.add(ele);
            }
            for(String ele: demo) {
                ans.add(ele);
            }
        }
        return ans;
    }
    public static ArrayList powerSetRecursive(String str) {
        if (str == "") {
            ArrayList<String> demo =  new ArrayList<>();
            demo.add(str);
            return demo;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = powerSetRecursive(ros);
        for (String ele: recResult) {
            myResult.add(ele);
            myResult.add(cc + ele);
            myResult.add(String.valueOf((int)cc) + ele);
        }
        return myResult;
    }
//    public static void printPowerSet(String str) {
//        if (str == "") {
//            return;
//        }
//        char cc = str.charAt(0);
//        String ros = str.substring(1);
//        ArrayList<String> recResult = new
//        printPowerSet(ros);
//    }
}
