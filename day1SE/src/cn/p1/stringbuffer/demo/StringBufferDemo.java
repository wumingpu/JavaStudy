package cn.p1.stringbuffer.demo;
/*
 *  StringBuilder和StringBuffer是相同功能的两个类。
 *  StringBuilder线程不安全，不保证线程同步，而StringBuffer是保证同步的
 *  StringBuilder在JDK1.5才出现，因为线程不安全，所以速度更快，推荐使用StringBuilder
 */

public class StringBufferDemo
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*
		 * StringBuffer:就是字符串缓冲区 用于存储数据的容器
		 * 1.长度是可变的
		 * 2.可以存储不同类型的数据
		 * 3.最终要转成字符串进行使用
		 * 4.可以对字符串进行修饰
		 * 
		 * 删除
		 * 
		 */
		bufferMethodDemo_2();
	}

	private static void bufferMethodDemo_2()
	{
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abce");
		sb.delete(1, 3);
		System.out.println(sb);
		// 清空缓冲区。
		sb.delete(0, sb.length());
		//替换
		sb.replace(1, 3, "nba");
		sb.setCharAt(2, 'q');
		
		//字符串反转
		System.out.println(sb.reverse());
	}

	private static void bufferMethodDemo_1()
	{
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abce");
		sb.insert(2, "qq");
		System.out.println(sb);
	}

	public static void bufferMethodDemo()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(4).append(false).append("haha");
		sb.append(true);
		sb.insert(1,"abcd");
		System.out.println(sb);
	}

}
