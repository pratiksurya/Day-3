package question_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Marks;
		System.out.print("Enter Marks: ");
		Marks=sc.nextInt();
		
//		while(true) {
//			if(Marks>0 && Marks<=100)
//				break;
//			else	
//			{
//				break;
//			}
//				
//		}
		
		if(Marks>80 && Marks<=100) {
			System.out.print("Grade: A");
			
		}
		else if(Marks>60 && Marks<=80) {
			System.out.print("Grade: B");
			
		}
		else if(Marks>50 && Marks<=60) {
			System.out.print("Grade: C");
			
		}
		else if(Marks>45 && Marks<=50) {
			System.out.print("Grade: D");
			
		}
		else if(Marks>25 && Marks<=45) {
			System.out.print("Grade: E");
			
		}
		else if(Marks<=25 && Marks>0) {
			System.out.print("Grade: F");
			
		}
		else {
			System.out.print("Enter Valid Marks...");
			
		}

	}

}
