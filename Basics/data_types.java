package Basics;

class data_types{
	public static void main(String args[]){
		// primitive data types i.e. int, boolean, double, char
		int num1 = 5;
		boolean bool = true;
		double num2 = 3.0;
		// characters goes in single quotation
		char a = 'h';
		// Non primitive i.e. String goes in double quotation
		String str = "Hello WOrld";
		// We can make variables equal to other variables
		int num4 = num1;
		// one more way to initialize a variables
		int x;
		x = 29;
		// can use +, -, * , / as it is for arithmetic operations
		// make sure of conversions of int, double
		// int values always return integer double 57/8 -> 8.0 instead of exact value
		double sum = (x + num1) / num2;
		// for exponent x**num4, shouble be 'double'
		double exp = Math.pow(x, num1);
		// to typecast use (new data type)variable
		double product = x / (double)num1;
		System.out.println(product);
	}


}