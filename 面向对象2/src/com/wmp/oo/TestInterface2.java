package com.wmp.oo;

public class TestInterface2 {
	// 面向接口编程，因为接口中东西是不变的，所以接口是最稳定的，可以让程序更加的稳定。
	
	// 接口就是规范。
	
	// 接口定义了以后就稳定不变了，变的是实现类。
}

interface A{
	void testa();
}

interface B{
	void testb();
}

interface C extends A, B{
	void testc();
}

class Mysubclass implements C{

	@Override
	public void testa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testc() {
		// TODO Auto-generated method stub
		
	}
	
}
