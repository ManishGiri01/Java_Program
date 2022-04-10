package unit_1;

public class p4_Task02_WrapperClassesinJava {

	public static void main(String[] args) {
		//converting int into Integer
		int a=20;
		
		String s=""+ a +"";
		
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly
		Integer j=a;//autoboxing now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a + " " + i + " " + j);
		
		System.out.println(i.toString());
		
		//a.toString() can not be done due to a is int not object
		
		//Autoboxing: converting primitives into objects
		byte b=10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		
		//Unboxing: converting objects to primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);

	}

}
