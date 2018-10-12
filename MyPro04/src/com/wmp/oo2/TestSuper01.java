package com.wmp.oo2;

public class TestSuper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class FatherClass{
	public int value;
	
	public void f() {}
	
}

class ChildClass extends FatherClass {
	public int value;
	
	public void f() {
		super.f(); // 可以调用父类的被覆盖的方法
	}
}