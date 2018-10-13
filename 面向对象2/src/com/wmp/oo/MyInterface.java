package com.wmp.oo;

public interface MyInterface {
	// 接口是比抽象类更抽象的东西。
	
	// 接口里面的方法全部是抽象方法，所以不用谢abstract修饰。
	// 接口就是契约就是规范。
	// 接口可以继承多个父接口。
	// 接口只定义不变的东西，所以只能定义常量和方法名。
	void test01();
	
	// 不管加不加修饰符，都会被加上public static final
	// 接口中不存在私有
	int maxAge = 100;
}

class myClass implements MyInterface{

	@Override
	public void test01() {
		System.out.println(maxAge);
		System.out.println("MyClass.test01");
		
	}
	
}
