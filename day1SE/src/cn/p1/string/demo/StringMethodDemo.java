package cn.p1.string.demo;

public class StringMethodDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		 * 按照面向对象的思想对字符串进行功能分类。
		 * “abcd”
		 * 
		 * 1. 获取：
		 * 1.1 获取字符串中的字符的个数（长度）。
		 *      int length();
		 * 1.2 根据位置获取字符
		 * 		char charAt (int index);
		 * 1.3 根据字符获取在字符串中的位置。
		 * 		int indexOf(int ch);
		 * 		int indexOf(int ch, int fromIndex);
		 * 		int indexOf(String str);
		 * 		int indexOf(String str, int fromIndex);
		 * 		
		 * 		int lastIndexOf(int ch);
		 * 		int lastIndexOf(int ch, int fromIndex);
		 * 		int lastIndexOf(String str);
		 * 		int lastIndexOf(String str, int fromIndex);
		 * 1.4 获取字符串中的一部分字符串。也叫子串。
		 * 		String subString(int beginIndex, int endIndex);//包含begin，不包含end
		 * 		String subString(int beginIndex);
		 * 
		 * 2. 转换
		 * 2.1 将字符串变成字符串数组（字符串的切割）
		 * 		String[] split(String regex); 涉及到正则表达式
		 * 2.2 将字符串变成字符数组。
		 * 		char[] toCharArray();
		 * 2.3 将字符串变成字节数组。
		 * 		byte[] getBytes();
		 * 2.4 将字符串中的字母转换成大小写
		 * 		String toUperCase()
		 * 		String toLowerCase()
		 * 2.5 将字符串的指定字符替换
		 * 		String replace(char,char);
		 * 		String replace(String s1,String s2);
		 * 2.6 将字符串两端的空格去掉
		 * 		String trim();
		 * 2.7 将字符串进行连接。
		 * 		String concat(string);
		 * 2.8 将基本数据类型变成字符串
		 * 		String valueOf(很多种数据类型的数据)
		 * 
		 * 3. 判断
		 * 3.1 两个字符串内容是否相同
		 * 		boolean equals(Object obj)
		 * 3.2 是否包含  contains
		 * 3.3 以什么开头或者结尾  startWith()  endWith()
		 * 
		 * 4. 比较
		 * 4.1 compareTo按照字母的字典顺序进行比较
		 * 
		 */
		stringMethodDemo_4();

	}

	private static void stringMethodDemo_4()
	{
		// TODO Auto-generated method stub
		System.out.println("a".compareTo("A"));
		
	}

	private static void stringMethodDemo_3()
	{
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println(s.equals("ABC".toLowerCase()));
		System.out.println();
		
		System.out.println(s.contains("cc"));
		
	}

	private static void stringMethodDemo_2()
	{
		// TODO Auto-generated method stub
		String s = "张三,李四,王五";
		String[] arr = s.split(",");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		String s1 = "张三.李四.王五";
		String[] arr1 = s1.split("\\.");
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++)
		{
			System.out.println(chs[i]);
		}
		
		s = "ab你";
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++)
		{
			System.out.println(bytes[i]);
		}
		
		String s2 = "java";
		String s3 = s1.replace('q', 'z');
		System.out.println(s2==s3);
		
		System.out.println("-"+"   ab     c     ".trim()+"-");
		
		System.out.println("abc".concat("kk"));
		
		System.out.println(String.valueOf(true));
	}

	private static void stringMethodDemo_1()
	{
		// TODO Auto-generated method stub
		String s = "abcdae";
		System.out.println("length:"+s.length()); // 6
		System.out.println("char:"+s.charAt(2)); // c
		System.out.println("index:"+s.indexOf('k')); // -1
		System.out.println("index:"+s.lastIndexOf('a')); // 4
		
		System.out.println("substring:"+s.substring(2,4));
	}

}
