package Basics;

import java.util.Scanner;
class While {
  public static void main(String[] args) {
    String x;
    Scanner input = new Scanner(System.in);
    do{
    	System.out.print("Number:");
        x = input.next();
        }
    while (Integer.parseInt(x) != 10);
    
  }
}