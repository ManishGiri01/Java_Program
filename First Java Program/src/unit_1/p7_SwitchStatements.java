package unit_1;
import java.util.Scanner;


/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class p7_SwitchStatements {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		// Write Logic here!
		int choice;
		while(true)
		{
		System.out.println();
		System.out.println("Enter your chocie");
		
		Scanner s=new Scanner(System.in);
		choice=s.nextInt();
		switch(choice)
		{
		case 1:System.out.println("2022");
		break;
		
		case 2:System.out.println("April");
		break;
		
		case 3:System.out.println("10");
		break;
		
		case 4:System.out.println("Not applicable");
		break;
		}
		}
		
		
	}
}