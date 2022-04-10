package unit_1;
/*Normally an array is a collection of similar type of elements which has contiguous memory location
 * Java array is an object which contains elements of similar data types
 * we can store only a fixed set of elements in a java array
 * size limit issues:
 * -we can store only fixed size of elements in an array
 * -It does not grow its size at runtime
 * -To solve this problem,collection framework is used in Java which grow automatically
 * 
 * 
 * -There are two types of array
 * 	-Single Dimensional
 * 	-Multidimensional
 * 
 * -Declare an array in java
 * 	-DataType arrayRefVar[];
 * or
 * 	-DataType[] arrayRefVar;
 * or
 * 	-DataType []arrayRefVar;
 * 
 * -Instantiation of an array in Java
 * 	-arrayRefVar=new dataType[size]; 
 */
public class p6_Task01_ArraysinJava {

	public static void main(String[] args) {
		//Declaration
		int array1[];
		int[] array2;
		int []array3;
		
		//cannot do it as we have not provide it any memory yet
		//array[0]=1;
		
		//Initialization,during it we have to provide the size of the array
		
		
		
		array1=new int[6];
		
		//Assigning values to the java array
		for(int i=0;i<array1.length;i++)//length is the property of array
		{
			array1[i]=i;
		}
		int array4[]= {33,3,4,5};//declaration,instantiation and initialization
		
		//passing array to method
		arrayAsParameter(array4);
		
		//passing anonymous array in a method
		arrayAsParameter(new int[] {33,3,4,5});
		
		//Returning array from the Method
		int[] array5=arrayAsReturnType();
		System.out.println(array5.toString());
		//Array index out of bound exception
		
		int arr[]= {50,60,70,80};
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//Multidimensional array in java 
		
		int[][] arr6=new int[3][3];//3 row and 3 coloumn
		
		for(int i=0,j=0;i<3 && j<3;i++,j++)
		{
			System.out.println(arr6[i][j]);
		}
		int counter=0;
		for(int i=0,j=0;i<3 && j<3;i++,j++)
		{
			counter++;
			arr6[i][j]=counter;
		}
		for(int i=0,j=0;i<3 && j<3;i++,j++)
		{
			System.out.println(arr6[i][j]);
		}
		
		

	}
	static void arrayAsParameter(int arr[])//declare empty array as a parameter
	{
		for(int i=0;i<arr.length;i++)//length is property of array
		{
			System.out.println(arr[i]);
		}
	}
	//Returning array from the method
	static int[] arrayAsReturnType()
	{
		int array4[]= {33,3,4,5};
		return array4;
	}
	

}
