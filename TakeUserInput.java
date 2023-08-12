import java.util.Scanner;
public class TakeUserInput {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a byte value of x");
		byte x = scan.nextByte();
		System.out.println("The value of x is: " + x);
		
		System.out.println("Enter a short value of a");
		short a = scan.nextShort();
		System.out.println("The value of a is: " + a);
		

		System.out.println("Enter a int value of y");
		int y = scan.nextInt();
		System.out.println("The value of y is: " + y);
		
		System.out.println("Enter a long value of L");
		long L = scan.nextLong();
		System.out.println("The value of L is: " + L);
		
		
		System.out.println("Enter a float value of p");
		float p = scan.nextFloat();
		System.out.println("The value of p is: " + p);
		
		
		System.out.println("Enter a Double value of q");
		double q = scan.nextDouble();
		System.out.println("The value of q is: " + q);
		
		
		
		System.out.println("Enter a boolean value of b");
		boolean b = scan.nextBoolean();
		System.out.println("The value of b is: " + b);
		
		
		
		
		
		
	}

}
