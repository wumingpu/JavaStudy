package com.wmp.oo;

public abstract class Animal {
	abstract public void shout();
	// 抽象方法不需要实现，必须包含在抽象类里面。
	// 抽象方法在子类中必须实现。
	// 抽象类里面可以由普通方法。
	// 抽象类不能被new，所以只能被继承。
	// 抽象类的意义：为子类提供统一的设计模板，子类必须实现抽象方法。
	
	public void run() {
		System.out.println("跑");
	}
}

class Dog extends Animal{
	// 抽象类可以严格限制子类的设计。
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("wang");
	}
	
}
