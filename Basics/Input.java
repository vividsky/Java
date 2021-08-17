package Basics;

import java.util.Scanner;
class Input{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Name and Age: ");
		String name = input.next();
		String age = input.next();
		//String salary = input.next();
		System.out.println("Name: " + name);
		try{
			System.out.println("Age: " + Integer.parseInt(age));
		}catch (NumberFormatException e){
			System.out.println("Age: " + age);
		}
	}
}
class output{
	public static void main(String[] args){
		String helloo = hello();
		System.out.println(helloo);
	}
	private static String hello(){
		String helloo = "Hello world";
		return helloo;
	}
}
