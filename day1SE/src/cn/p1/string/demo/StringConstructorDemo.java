package cn.p1.string.demo;

public class StringConstructorDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		stringConstructorDemo2();

	}

	public static void stringConstructorDemo2()
	{
		// TODO Auto-generated method stub
		char[] arr = {'w','a','p','q','x'};
		
		String s1 = new String(arr);
		System.out.println("s1="+s1);// wapqx
		
		String s2 = new String(arr,1,3); // 构造函数从第一个开始取，取3个
		System.out.println("s2="+s2); 
	}

	public static void stringConstructorDemo()
	{
		// TODO Auto-generated method stub
		String s = new String(); // 等效于String s = ""; 不等效String s = null;
		
		byte[] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println("s1="+s1); // ABCD
	}


}
