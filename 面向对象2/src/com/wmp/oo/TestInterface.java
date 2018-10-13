package com.wmp.oo;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volant v = new Agnel(); // 可以把实现了接口的类付给接口，但也只能调用接口中定义的方法。
		v.fly();
	}

}

interface Volant{
	int FLY_HEIGHT = 1000;
	void fly();
}

interface Honest{
	void helpOther();
}

class Agnel implements Volant,Honest{

	@Override
	public void helpOther() {
		// TODO Auto-generated method stub
		System.out.println("Angel.helpOther(");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

class GoodMan implements Honest{

	@Override
	public void helpOther() {
		// TODO Auto-generated method stub
		
	}
	
}

