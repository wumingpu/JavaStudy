package com.wmp.oo2;

public class TestSuper02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class FatherClass2{
	public FatherClass2() {
		super(); // 调用父类的构造器，这句话可有可无，默认会加上这个super，调用Object类的构造器
		// 父类创建好之后，才会建立子类。
	}
}

class ChildClass2 extends FatherClass2{
	public ChildClass2() {
		super(); // super永远位于构造器的第一句。
	}
}
