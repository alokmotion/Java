import java.util.Scanner;
public class NextLineMethodIssueSolved {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a int type value ");
		int intNum = scan.nextInt();
		System.out.println("The int value is :" + intNum);
		
		System.out.println("Enter a float value ");
		float floatNum = scan.nextFloat();
		System.out.println("The float value is : " + floatNum);
		
		scan.nextLine(); // to read enter
		
		System.out.println("Enter a sentence");
		String sentence = scan.nextLine();
		System.out.println("The sentence is:" + sentence);
		
		System.out.println("Enter a single word");
		String word = scan.next();
		System.out.println("The Single word is :" + word);
		

	}

}
