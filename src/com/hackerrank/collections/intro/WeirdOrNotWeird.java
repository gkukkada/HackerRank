package com.hackerrank.collections.intro;

import java.util.Scanner;

public class WeirdOrNotWeird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 0 && n<=5 && n>=2) {
			ans = "Not Weird";
		} else if(n % 2 == 0 && n>20) {
			ans = "Not Weird";
			// Complete the code

		} else if(n % 2 == 0 && n<=20 && n>=6){
			ans = "Weird";
		} else {
			ans = "Weird";
		}
		System.out.println(ans);

	}

}
