package cn.p1.string.demo;

public class StringDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		 * String类的特点：
		 * 字符串对象一旦被初始化就不会被改变了。
		 * 
		 */
		stringDemo2();
	}

	private static void stringDemo2()
	{
		// TODO Auto-generated method stub
		String s = "abc";
		
		String s1 = new String("abc"); // 在内存中另外又再实例化一个对象  在堆内存中
		
		System.out.println(s == s1); // false
		
		System.out.println(s.equals(s1)); // true 
		// string 类中的equals腹泻object中的equals建立了string类自己的判断字符串对象是否相同的依据
		// 其实就是比较字符串内容。
	}

	/**
	 * 演示字符串定义的第一种方式，并明确字符串常量池的特点。
	 * 翅中没有就建立，池中有就直接用
	 * */
	private static void stringDemo1()
	{
		String s = "abc"; // abc 存储在字符串常量池中。
//		s = "nba";
		String s1 = "abc";
		System.out.println(s == s1); // true
		//字符串常量池的机制，所以为真
//		System.out.println("s="+s);
	}

}
