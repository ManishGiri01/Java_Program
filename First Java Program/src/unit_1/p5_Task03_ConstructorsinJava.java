package unit_1;

public class p5_Task03_ConstructorsinJava {

	public static void main(String[] args) {
		ABC4 obj=new ABC4();
		
		ABC4 obj1=new ABC4(1);
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		
		

	}

}
class ABC4{
	int a;
	
	/*
	 * className(Constructor parameter)
	 * {
	 * All the class and instance variables can be initialized here!
	 * 
	 */
	
	ABC4()
	{
		a=10;
	}
	
	ABC4(int a)
	{
		this.a=a;
	}
	void display()
	{
		int b=10;
		
		System.out.println(a);
		System.out.println(b);
	}
	int display2()
	{
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method
		//SYstem.out.println(b);
		return a;
	}
	
}