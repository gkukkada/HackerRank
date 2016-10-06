package com.hackerrank.collections.advanced;

/*
 * https://www.hackerrank.com/challenges/java-singleton
 */
class Singleton {
	public String str;
	private static Singleton instance = null;

	protected Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}

