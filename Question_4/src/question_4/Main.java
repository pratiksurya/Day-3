// Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). 
// Print average and product of all numbers.

package question_4;

import java.util.Scanner;





public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,sum=0,product=1,counter=0;
		float avg=0;
		char c;
		
		
<<<<<<< Updated upstream
//	1.Using String
=======
//		1.Using String
>>>>>>> Stashed changes
		String ch;	
		do {
			System.out.println("Enter Number: ");
			ch=sc.next();
			c=ch.charAt(0);
			
			if(c=='q') {
				break;
			}
			else {
				num=Integer.parseInt(ch);
				counter++;
			}
			sum=sum+num;
			product=product*num;
			
			
<<<<<<< Updated upstream
		System.out.print("Enter q to Exit or ");
=======
		System.out.print("Enter q to Exit else ");
>>>>>>> Stashed changes
			
		}while(c!='q');
		avg=(sum/(float)counter);
		
		System.out.println("Counter : "+counter);
		System.out.println("Average : "+avg);
		System.out.println("Product : "+product);
		
		

		
<<<<<<< Updated upstream
//	2.Without String
=======
//		2.Without String
>>>>>>> Stashed changes
//		do {
//			System.out.println("Enter Number: ");
//			num=sc.nextInt();
//			counter++;
//			sum=sum+num;
//			product=product*num;
//			
//			
//			System.out.println("Enter q to Exit...or Press y To continue");
//			c=sc.next().charAt(0);
//			
//		}while(c!='q');
//		avg=(sum/(float)counter);
//		
//		System.out.println("Counter : "+counter);
//		System.out.println("Average : "+avg);
//		System.out.println("Product : "+product);
	
	
	
	
	}

}
