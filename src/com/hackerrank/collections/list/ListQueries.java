package com.hackerrank.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		StringTokenizer strToken = new StringTokenizer(input);
		int count = strToken.countTokens();
		List<Integer> arr = new ArrayList<Integer>();
		
		if(arrSize==count){
			for (int x = 0; x < arrSize; x++) {
				arr.add(Integer.parseInt((String) strToken.nextElement()));
			}
		} else {
			sc.close();
			throw new ArrayIndexOutOfBoundsException("Invalid size");
		}
		int noOfQueries = sc.nextInt();
		for (int x = 0; x < noOfQueries; x++) {
			String query = sc.next();
			if (query.equalsIgnoreCase("insert")) {
				sc.nextLine();
				String inputToken = sc.nextLine();
				String[] split = inputToken.split("\\s+");
				List<Integer> insertList = new ArrayList<Integer>();
				int i=0;
				for (String string : split) {
				    insertList.add(Integer.parseInt(string));
				    i++;
				}
				if (insertList.size()==2){
					arr.add(insertList.get(0), insertList.get(1));
				} else {
					sc.close();
					throw new ArrayIndexOutOfBoundsException("Invalid no of elements for Insert");
				}
				
			} else if (query.equalsIgnoreCase("delete")) {
				int deleteIndex = sc.nextInt();	
				arr.remove(deleteIndex);
			} else {
				System.out.println("Oops Wrong selection! Exiting");
				sc.close();
				System.exit(1);
			}
		}
		String str = "";
		for (Integer integer : arr) {
			str += integer;
			str += " ";
		}
		System.out.println(str);
		sc.close();
	}

}
