package Recursion;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        System.out.println(mazePath(0, 0,2,2).size());
    }
    public static ArrayList mazePath(int cr, int cc, int er, int ec) {
        if (cr > er || cc > ec) return new ArrayList();
        if (cr == er &&  cc == ec) {
            ArrayList<String> demo  = new ArrayList<>();
            demo.add("");
            return demo;
        }
        ArrayList<String> myResult = new ArrayList<>();
        for(int i = 0; i <= 1; i++) {
            for(int j = 0; j <= 1; j++) {
                if(i!=0 || j != 0) {
                    ArrayList<String> recResult = mazePath(cr+i, cc+j, er, ec);
                    for (String ele: recResult) {
                        if (i == 0) {
                            myResult.add('H' + ele);
                        } else if(j == 0) {
                            myResult.add('V' + ele);
                        } else {
                            myResult.add('D' + ele);
                        }
                    }
                }
            }
        }
        return myResult;
    }
}
