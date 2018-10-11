package com.wmp.oo2;

public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object obj;
		TestObject to = new TestObject();
		System.out.println(to); // 此时会滴啊用to的toString()方法
		// 为什么TestObject会有toString()方法，因为默认继承的Object类中有toString方法
		
	}
	
	public String toString() { // 重写toString()方法
		return "test object";
	}

}

class Person2{
	String name;
	int age;
	
	@Override
	public String toString() {
		return name+"age:"+age;
	}
}
