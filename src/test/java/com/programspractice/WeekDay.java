package com.programspractice;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number betwen 0-6");
		int num = sc.nextInt();

		switch (num) {
		case 0:
			System.out.println("For the input number "+num+" value is Sunday");
			break;
		case 1:
			System.out.println("For the input number "+num+" value is Monday");
			break;
		case 2:
			System.out.println("For the input number "+num+" value is Tuesday");
			break;
		case 3:
			System.out.println("For the input number "+num+" value is Wednesday");
			break;
		case 4:
			System.out.println("For the input number "+num+" value is Thrusday");
			break;
		case 5:
			System.out.println("For the input number "+num+" value is Friday");
			break;
		case 6:
			System.out.println("For the input number "+num+" value is Saturday");
			break;
		default:
			System.out.println("INVALID NUMBER ENTRY");
			break;
		}

	}

}
