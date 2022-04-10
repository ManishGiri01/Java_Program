package unit_1;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class p8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
		boolean k=false;
		
		int n=s.length();
		for(int i=0;i<n/2+1;i++)
		{
			if(s.charAt(i)==s.charAt(n-i-1))
			{
				k=true;
			}
		}
		if(k==true)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		

	}

	void reverseOfAString(String s) {
		
		// Write Logic Here!
		int n=s.length();
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
	}
}