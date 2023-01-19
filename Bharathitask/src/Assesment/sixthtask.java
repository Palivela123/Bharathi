//array compare
package Assesment;
import java.util.*;

public class sixthtask {

	public static void main(String[] args) {
		
		
		
		        int total=0;
		        Scanner sc=new Scanner(System.in);
		        System.out.println("no of elem");
		        int n=sc.nextInt();
		        int array[]=new int[8];
		        System.out.println("enter elem of array");
		        for(int i=0;i<n;i++) {
		            array[i]=sc.nextInt();    
		        }
		        for(int j: array)
		            total=total+j;
		        System.out.println(total);
		    }

		 

		}

	