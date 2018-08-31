package YouDoIt;

import java.util.Scanner;

public class ArithmeticDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum;
		int secondNum;
		int sum;
		int difference;
		double average;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer >> ");
		firstNum = input.nextInt();
		System.out.print("Please enter another integer >> ");
		secondNum = input.nextInt();
		
		sum = firstNum + secondNum;
		difference = firstNum - secondNum;
		average = (double) (sum / 2);
		
		System.out.println(firstNum + " + " + secondNum + " is " + sum);
		System.out.println(firstNum + " - " + secondNum + " is " + difference);
		System.out.println("The average of " + firstNum + " and " + secondNum + " is " + average);
	}

}
