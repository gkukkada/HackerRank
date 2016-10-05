package com.hackerrank.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {

	private String fname;
	private int id;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.fname = fname;
		this.id = id;
		this.cgpa = cgpa;
	}

	public String getFname() {
		return fname;
	}

	public int getId() {
		return id;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class SortStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = Collections
				.synchronizedList(new ArrayList<Student>());
		if (testCases >= 2 && testCases <= 1000) {
			while (testCases > 0) {
				int id = in.nextInt();
				String fname = in.next();
				double cgpa = in.nextDouble();
				int nameSize = fname.length();
				System.out.println(nameSize);
				if (cgpa <= 4.0 && cgpa >= 0 && nameSize <= 30 && id <= 10000
						&& id >= 0) {
					Student st = new Student(id, fname, cgpa);
					studentList.add(st);

					testCases--;
				} else {
					in.close();
					try {
						throw new Exception("Didn't meet the constraints");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		} else {
			System.out.println("Didn't meet the constraints. Exiting");
			in.close();
			System.exit(0);
		}
		Collections.sort(studentList, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				if (((Student) o1).getCgpa() == ((Student) o2).getCgpa()) {
					int value2 = ((Student) o1).getFname().compareTo(
							((Student) o2).getFname());
					if (value2 == 0) {
						return ((Student) o2).getId() - ((Student) o1).getId();
					} else {
						return value2;
					}
				} else if (((Student) o1).getCgpa() < ((Student) o2).getCgpa()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		in.close();
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
