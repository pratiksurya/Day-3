package question_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,avg,sum=0,product=1,counter=0;
		char ch='z';	
		do {
			System.out.println("Enter Number: ");
			num=sc.nextInt();
			counter++;
			sum=sum+num;
			product=product*num;
			
			
		System.out.println("Enter q to Exit...or Press y To continue");
		ch=sc.next().charAt(0);
			
		}while(ch!='q');
		avg=sum/counter;
		
		System.out.println("Average : "+avg);
		System.out.println("Product : "+product);
	}

}