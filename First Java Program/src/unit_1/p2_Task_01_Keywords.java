package unit_1;
//private:"Inside class only"
//protected:class+same package
//public:class + eithin package+outside the package
//Default:No keyword,package=private(Not outside package)

public class p2_Task_01_Keywords {
	public static final double pi=3.14;
	//final keyword is used for assigning constant value which will remain same throughout the program

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(pi);
		//The method main(String[]) in the type Second_Java_Program_Constants is not applicable for the arguments (String)
		main("calling the program");
		NewClass obj=new NewClass();
		obj.add(1, 2);
		//system.out.println(obj.pi);

	}
	public static void main(String args)
	{
		System.out.println(pi);
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(pi);
	}

}
class NewClass
{
	void add(int a,int b)
	//final double pi=3.18{constant value cant be modified}
	{
		
		System.out.println(a+b);
		//value of pi is taken from class Second_Java_Program_Constants into new  class created
		//another way of resolving the problem is by declaring the variable globally
		System.out.println(p2_Task_01_Keywords.pi);
	}
}
																			