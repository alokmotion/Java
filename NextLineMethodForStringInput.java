import java.util.Scanner;

public class NextLineMethodForStringInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your full name");
		String fullName = scan.nextLine();
		System.out.println("Your full name is:" + fullName);
		

	}

}
