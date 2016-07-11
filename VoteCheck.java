import java.util.Scanner;

public class VoteCheck {

	public static void main(String[] args) {
		 System.out.print("Enter your Age: ");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if (age > 17)
		{
			System.out.println("You are eligible to vote!");
			
		}
		else
		{
			System.out.println("Sorry! You are not eligible to Vote!!");
		}

	}

}
