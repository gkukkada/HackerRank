package com.hackerrank.collections.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * https://www.hackerrank.com/challenges/java-exception-handling-try-catch
*/

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		try{
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a/b);
		} catch (InputMismatchException e){
			System.out.println(e.getClass().getName());
		} catch (ArithmeticException e){
			System.out.println("java.lang.ArithmeticException: / by zero");
		}

	}

}
