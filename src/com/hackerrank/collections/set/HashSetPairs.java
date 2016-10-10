package com.hackerrank.collections.set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashSetPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of pairs: ");
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];
		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		
		// TODO: Do the duplication 
		Map<String, String> map = new HashMap<String, String>();
		String output = "";
		for (int i = 0; i < t; i++) {
			if(map.put(pair_left[i], pair_right[i]) != null){
				System.out.println(i);
				output += i;
			}
		}
		System.out.println(output);
//		5
//		john tom
//		john mary
//		john tom
//		mary anna
//		mary anna
	}

}
