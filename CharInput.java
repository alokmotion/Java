import java.util.Scanner;
public class CharInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scan.next().charAt(0);
		System.out.println("The character value is:" + ch);
		

	}

}
