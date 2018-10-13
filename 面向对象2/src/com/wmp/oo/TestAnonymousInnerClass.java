package com.wmp.oo;

public class TestAnonymousInnerClass {
	public static void test01(AA a) {
		a.aa();
	}
	
	public static void main(String[] args) {
		TestAnonymousInnerClass.test01(new AA() { // 匿名内部类，适用于只用于一次的类，安卓中大量使用匿名内部类

			@Override
			public void aa() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类的实现");
			}
			
		});
	}
}

interface AA{
	void aa();
}


