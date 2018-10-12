package com.wmp.oo2;
/**
 * 测试多态
 * @author wmp
 *
 */
public class TestPolym {
	public void main(String[] args) {
		Animal a = new Animal();
		animalCry(a);
		
		Dog d = new Dog();
		animalCry(d); // 发生多态，多态条件2，向父类对象传递子类引用。父类引用指向子类对象。
		
		Animal d1 = new Dog(); // 自动向上转型，此时编译器认为d1就是Animal。
		Dog d2 = (Dog)d1; // 自动向下转型
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
	
	// 没有多态的情况下， 会出现大量的重载方法
//	static void animalCry(Dog d) {
//		
//	}
//	static void animalCry(Cat c) {
//		
//	}
}

class Animal{
	// 父类方法加了final，子类不能重写，子类也不能继承了。
	// 修饰变量，就不能被改变了。
	final int abc = 10;
	public void shout() {
		System.out.println("jiaoleyisheng");
	}
}

class Dog extends Animal{ // 多态条件1，发生继承
	public void shout() {
		System.out.println("wang");
	}
}

class Cat extends Animal{
	public void shout() {
		System.out.println("miao");
	}
}
