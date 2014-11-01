package cn.p1.string.demo;

public class StringObjectDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		String s1 = "abc";
//		String s2 = "abc";
		
		//intern() 对字符串池进行操作   返回字符串对象的规范化表示形式。
		String s1 = new String("abc"); // 这个abc是新new的String对象自己维护的
		String s2 = s1.intern(); // 返回字符串池中的对象。  字符串池中的都是共享的字符串对象。
		System.out.println(s1==s2);
	}

}
