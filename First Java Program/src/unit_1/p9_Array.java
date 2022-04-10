package unit_1;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class p9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] a) {
		// write code here!
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		int visit=-1;
		int[] freq=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visit;
				}
			}
			if(freq[i]!=visit)
			{
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visit)
			{
				System.out.println("frequency of "+arr[i]+" :"+freq[i]);
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visit && freq[i]>1)
			{
				System.out.println(arr[i]+" have duplicate numbers");
			}
		}
		

	}

	void findSecondLargestAndSecondSmallestElement(int[] a) {
		// write code here!
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("second largest number is"+a[n-2]);
		System.out.println("second smallest number is"+a[2]);

		
		

	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		int n = 3;  
       
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        
        for(int i = 0; i < n; i++){  
            int j, first;  
            
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){  
                 
                arr[j] = arr[j+1];  
            }  
            
            arr[j] = first;  
        }  
        System.out.println();  
        
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();

	}

	void removeElementInArray(int[] arr) {
		// write code here!
		
	    int element = 1;
	    int size=arr.length;
	    
	    for(int i=0; i<size; i++)
	      {
	         if(element==arr[i])
	         {
	            for(int j=i; j<(size-1); j++)
	               arr[j] = arr[j+1];
	            break;
	         }
	      }
	      
	      System.out.println("\nThe new array is: ");
	      for(int i=0; i<(size-1); i++)
	         System.out.print(arr[i]+ " ");

	}

}
