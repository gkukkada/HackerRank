package com.hackerrank.collections.advanced;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-iterator
*/
public class Main {

	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String) {
				break;
			}
		}
		return it;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}

		mylist.add("###");
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		Iterator it = func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}
	}
}
