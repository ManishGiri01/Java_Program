package unit_1;

public class p2_Task_02_Constants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syntax error on token "double", invalid VariableDeclaratorId
		int double=12;
		
		
		//Syntax error on token "new", invalid AnnotationName
		int new()
		{
			System.out.println();
			return 0;
		}
		
		//Syntax error on token "int", delete this token
		//class name can never be any keyword
		ABC int=new ABC();
		
		ABC obj=new ABC();
		obj.display();
		

	}
}
	//Syntax error on tokens, delete these tokens
	class int
	{
		void display()
		{
			System.out.println("Another class");
		}
	}
	class ABC
	{
		void display()
		{
			System.out.println("Working class");
		}
	}
}

