package com.wmp.oo2;
/**
 * 测试封装
 * @author wmp
 *
 */
public class TestEncapsulation {
	/*
	 * 封装的使用细节
	 * 
	 * 类的属性一般是私有的。基本上都是私有的。其他的类访问不到，私有起来了，提供相应的set和get方法进行访问。
	 * 普通的方法，一般就是public方法。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human();
		// h.age = 13; 
		h.name = "abc"; // 相同的包，可以访问，默认的访问修饰符，可以被本包下面的包访问。修饰符为default
	}

}

class Human{
	private int age;
	String name;
	protected int height; // 本包可用，不同包继承了此类的包可以使用。
	
	void sayAge() {
		System.out.println(age);
	}
}

class Boy extends Human{
	void sayHello() {
		// System.out.println(age); // 子类无法使用父类的私有属性
	}
}
