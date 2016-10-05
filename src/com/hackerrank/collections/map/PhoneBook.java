package com.hackerrank.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      Map<String, Integer> phoneBook = new HashMap<String, Integer>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         phoneBook.put(name, phone);
	         in.nextLine();
	      }
	      
	      List<String> queries =  new ArrayList<String>();
	      long startTime = System.currentTimeMillis();
	      
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         queries.add(s);
	         break;
	      }
	      Set<String> keySet = phoneBook.keySet();
	      Iterator<String> it = keySet.iterator();
	      while(it.hasNext()){
	    	  String st = it.next();
	    	  System.out.println(st);
	      }
	      
	      for(String query : queries){
	    	 // query.contains();
	    	  if(phoneBook.containsKey(query)){
	    		  System.out.println(query+"="+phoneBook.get(query));
	    	  } else {
	    		  System.out.println("Not found");
	    	  }
	      }
	      
	}

}
