package com.wmp.oo2;


/**
 * 测试继承
 * @author wmp
 *
 */
public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *	java里面只能扩展一个类，不能像C++一样，继承多类。java的接口可以多继承
		 *
		 * 如果没有定义继承，则默认继承的是java.lang.Object
		 * 
		 * 可以使用Ctrl + T查看类的继承树
		 */
		
		Student stu = new Student();
		stu.name = "a";
		
		Student stu2 = new Student("a", 18, "b");
		
		System.out.println(stu2 instanceof Student); // instanceof判断类型
		System.out.println(stu2 instanceof Person);
		System.out.println(stu2 instanceof Object);
	}

}

class Person{
	String name;
	int height;
	
	public void rest() {
		System.out.println("休息一会");
	}
}

class Student extends Person{
	// String name;
	// int height;
	String major;
	
	public void study() {
		System.out.println("学习");
	}
	
	public Student(String name, int height, String major) {
		this.name = name;
		this.height = height;
		this.major = major;
	}
	
	public Student() {}
	
}
