package com.wmp.oo;
/**
 * 测试菲静态内部类
 * @author wmp
 *
 */
public class TestInnerClass {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner(); // 创建内部类对象的方法。
		
		inner.show();
	}
}

class Outer{
	private int age = 10;
	
	public void testOuter() {
		
	}
	
	class Inner{ // 普通内部类中不能定义静态类和方法。
		int age = 20;
		// 非静态内部类，这个也是独立的类。
		// 内部类可以直接访问外部类的成员，主要为外部类提供服务。
		public void show() {
			int age = 30;
			System.out.println(Outer.this.age); // 访问外部类成员
			System.out.println(this.age); // 访问内部类成员
			System.out.println(age); // 访问局部变量
		}
	}
	
	static class InnerStatic{
		
	}
}
