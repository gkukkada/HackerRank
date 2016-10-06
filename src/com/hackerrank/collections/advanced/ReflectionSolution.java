package com.hackerrank.collections.advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/*
 * https://www.hackerrank.com/challenges/java-reflection-attributes
*/
class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
public class ReflectionSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class student = Student.class.getClass();
        Method[] methods = Student.class.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method: methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
	}

}