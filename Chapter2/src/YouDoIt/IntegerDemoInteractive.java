package YouDoIt;

import java.util.Scanner;

public class IntegerDemoInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anInt ;
		byte aByte ;
		short aShort ;
		long aLong ;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an interger >> ");
		anInt = input.nextInt();
		
		System.out.print("The in is an integer >> ");
		anInt = input.nextInt();
		System.out.print("Please enter a byte interger >> ");
		aByte = input.nextByte();
		System.out.print("Please enter a short integer >> ");
		aShort = input.nextShort();
		System.out.print("Please enter a long integer >> ");
		aLong = input.nextLong();
		System.out.print("What is your name >> ");
		name = input.next();
		
		System.out.println("Your name is " + name);
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);

	}

}
