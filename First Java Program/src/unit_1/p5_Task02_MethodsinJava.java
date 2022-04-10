package unit_1;

public class p5_Task02_MethodsinJava {

	public static void main(String[] args) {
		ABC3 obj=new ABC3();
		
		//calling display method definition
		obj.display();
		System.out.println(obj.a);
		

	}

}
class ABC3
{
	static int a=10;
	
	/*Actual methods definition
	 * 
	 * DataTypes mehodName(DataType2 p1,DataType2 p2)
	 * {
	 * methodBody;
	 * return value;//if required
	 */
	
	static void display()
	{
		int b=10;
		int a=10;
		System.out.println(b);
	}
	int display2()
	{
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method
		//System.out.println(b);
		
		return a;
	}
}