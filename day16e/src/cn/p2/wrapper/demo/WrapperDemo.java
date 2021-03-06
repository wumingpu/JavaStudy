package cn.p2.wrapper.demo;

public class WrapperDemo
{

	public static void main(String[] args)
	{
		/*
		 * 基本数据类型对象包装类。
		 * 为了方便操作基本数据类型值，将其封装成了对象，在对象中定义了属性和行为丰富了该数据的操作。
		 * 用于描述该对象的类就成为基本数据类型对象包装类。
		 * 
		 * byte  Byte
		 * short  Short
		 * int    Integer
		 * long   Long
		 * float  Float
		 * double Double
		 * char   Character
		 * boolean  Boolean
		 * 
		 * 基本类型--》字符串
		 *     1.基本类型数值+“”
		 *     2.用String类中的静态方法valueOf(基本类型数值)
		 * 
		 * 字符串--》基本类型
		 *     1.使用包装类中的静态方法 xxx parseXxx("xxx类型的字符串")
		 *       int parseInt("int String");
		 *       long parseLong("long String");
		 *       Boolean parseBoolean("boolean String");
		 *       只有character类型没有这种parse方法
		 *     2.如果字符串被Integer进行对象的封装
		 *       可使用另一个非静态方法，intValue();
		 *       将Integer对象转换成基本数据类型值
		 * 
		 */
		int num;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.toBinaryString(-6)); // 负数的二进制等于正数取反再加一
		
//		int num1 = 4;
//		Integer i = new Integer(num1);
//		System.out.println(i);
//		
//		int x = Integer.parseInt("123");
//		System.out.println(x);
//		
//		if(Boolean.parseBoolean("true"))
//			System.out.println("true");
		
//		Integer i = new Integer("123");
//		System.out.println(i.intValue());
		
		/*
		 * 正数具备不同的禁制体现
		 * 
		 * 十进制--》其他进制
		 * 
		 * 其他进制--》十进制
		 */
		
		// 十进制--》其他进制
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
		System.out.println(Integer.toString(60, 4)); // 转化成任意进制，在此为4进制
		
		// 其他进制--》十进制。
		System.out.println(Integer.parseInt("110", 2)); // 将110认为是2进制
		
		// 对象上的比较
		Integer a = new Integer("3");
		Integer b = new Integer(3);
		System.out.println(a==b); // false
		System.out.println(a.equals(b)); // true
		// 单纯从数字上比较
		System.out.println(a.compareTo(b)); // a比b大则返回1，a比b小则返回-1，相等为0
		

	}

}
