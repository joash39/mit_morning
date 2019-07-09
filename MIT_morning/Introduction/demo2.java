public class demo2{
	public static void main(String[] args){
		// Type casting in java
		// Type casting is assigning a datatype to another datatype
		// Types: Widening and Narrowing
		// Widening :convert from a smaller datatype to a larger datatype
		// byte => short =>char => int => float =>double
		// 2. Narrowing: converts a larger type to a smaller type
		// double => float => long => int => char => short => byte

		int numInt = 9;

		double numDouble = numInt;

		System.out.println(numInt);
		System.out.println(numDouble);
	}
}
