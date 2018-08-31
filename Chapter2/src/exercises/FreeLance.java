package exercises;

import java.util.Scanner;

public class FreeLance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int firstNum;
		int secondNum;
		int total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name >> ");
		name = input.next();
	
		System.out.println("Please enter a Number >> ");
		firstNum = input.nextInt();
		
		System.out.println("Please enter another number >> ");
		secondNum = input.nextInt();
		
		total = firstNum + secondNum;
		
		System.out.print("Your name is " + name);
		System.out.print(" and your total is " + total);
		

	}

}
