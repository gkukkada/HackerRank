package com.hackerrank.collections.advanced;

public class Add {
	void add(int... a) {
		if (a.length == 2) {
			System.out.println(a[0] + "+" + a[1] + "=" + (a[0] + a[1]));
		} else if (a.length == 3) {
			System.out.println(a[0] + "+" + a[1] + "+" + a[2] + "="
					+ (a[0] + a[1] + a[2]));
		} else if (a.length == 4) {
			System.out.println(a[0] + "+" + a[1] + "+" + a[2] + "+" + a[3]
					+ "=" + (a[0] + a[1] + a[2] + a[3]));
		} else if (a.length == 5) {
			System.out.println(a[0] + "+" + a[1] + "+" + a[2] + "+" + a[3]
					+ "+" + a[4] + "=" + (a[0] + a[1] + a[2] + a[3] + a[4]));
		} else if (a.length == 6) {
			System.out.println(a[0] + "+" + a[1] + "+" + a[2] + "+" + a[3]
					+ "+" + a[4] + "+" + a[5] + "="
					+ (a[0] + a[1] + a[2] + a[3] + a[4] + a[5]));

		}
	}
}
