//Array sum
package Assesment;

public class fifthtask {

	public static void main(String[] args) {
		  
		int arr[]= {1,2,3,4,5};
		int temp;
		for(int i=0;i<arr.length;i++) {
		     for(int j=i;j<arr.length;j++) {
		         if(arr[i]<arr[j]) {
		             temp=arr[i];
		             arr[i]=arr[j];
		             arr[j]=temp; 
		         }
		     }
		}
		for(int k:arr)
		     System.out.println(k);

		}
		}

	