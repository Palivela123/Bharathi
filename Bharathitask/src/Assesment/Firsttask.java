package Assesment;
import java.util.*;

public class Firsttask {

	public static void main(String[] args) {
		
		        Scanner sc=new Scanner(System.in);
		        System.out.println("enter any number");
		        int num=sc.nextInt();
		        boolean isPrime = true;
		            for(int i=2;i<num;i++) {  
		            if(num%i==0) {
		                isPrime=false;
		                break;
		            }
		        }
		        if(isPrime)
		            System.out.println("prime");
		        else 
		            System.out.println("not a prime");



		 

		    }

		 

		

	}


