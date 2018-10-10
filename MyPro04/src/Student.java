/**
 * 学生类
 * @author wmp
 *
 */
public class Student {
	// 类是抽象
	// 所谓抽象   是抽出像的部分
	
	// 类的属性，
	int id;
	String name;
	int age;
	Computer comp;
	
	// 对象的方法，没有方法的对象是结构体，算不上是对象了。
	void study() {
		System.out.println("学习，使用电脑"+comp.brand);
	}
	
	void play() {
		System.out.println("玩");
	}
	
	// 构造方法，用于创建这个类的对象，无参数的构造方法可以由系统自动创建
	Student(){
		
	}
	
	public static void main(String[] args) {
		Student stu = new Student(); // 创建一个对象，调用了构造方法
		stu.id = 1001;
		stu.name = "abc";
		stu.age = 18;
		
		Computer c1 = new Computer();
		c1.brand = "联想";
		stu.comp = c1;
		
		stu.study();
		stu.play();
	}
	
}

// 一个java文件中可以有多个类，但是只能有一个public修饰的类。
class Computer{
	String brand;
}
