package question_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pCounter=0,nCounter=0,oCounter=0,eCounter=0,num;
		for(int i=1;i<=20;i++) {
			System.out.println("Enter The Number: ");
			num=sc.nextInt();
			if(num<0) {
				nCounter++;
			}
			else{
				pCounter++;
				if(num%2==0) {
					eCounter++;
				}
				else {
					oCounter++;
				}	
			}
		}
		System.out.println("NO of Positive Number: "+pCounter);
		System.out.println("No of Negative Number: "+nCounter);
		System.out.println("No of Even Number: "+eCounter);
		System.out.println("No of Odd Number"+oCounter);

	}

}