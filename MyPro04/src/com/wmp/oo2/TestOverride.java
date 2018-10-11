package com.wmp.oo2;

/**
 * 测试重写
 * @author wmp
 *
 */

public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h = new Horse();
		h.run();
	}

}

class Vehicle{
	public void run() {
		System.out.println("跑");
	}
	
	public void stop() {
		System.out.println("stop");
		
	}
	
	public Person whoIsPsg() {
		return new Person();
	}
}

class Horse extends Vehicle{
	public void run() {
		System.out.println("override run");
	}
	
	public Student whoIsPsg() {
		return new Student(); // Student 是Person的子类，所以是返回值是小于父类，可行
		// 如果是return new Object()，则不可行。
	}
}

// 返回值类型，子类小于父类
