import java.util.Scanner;

public class DaysOfMonthEx {

	public static void main(String[] args) {
	int month;
	System.out.print("Enter the month number: ");
	Scanner s = new Scanner(System.in);
    month = s.nextInt();
	switch(month)
	{
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
			case 11: System.out.println("Has 31 days"); break;
				
			case 4:
			case 6:
			case 8:
			case 10:
			case 12: System.out.println("Has 30 Days"); break;
				
			case 2:	System.out.println("Has 28/29 Days"); break;
		    default: System.out.println("Sorry! Not an valid month / date");
	}    
	
	}

}
