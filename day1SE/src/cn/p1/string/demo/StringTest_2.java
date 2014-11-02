package cn.p1.string.demo;

public class StringTest_2
{

	/*
	 * 2.统计字符串中字母或字符串出现的次数 
	 * 思路： 
	 * 1.要找的字符串是否存在，如果存在获取其出现的位置。这个可以使用indexOf完成。
	 * 2.如果找到了，那么就记录出现的位置并在剩余的字符串中继续查找该字符串，而剩余字符串的起始位置是出现位置+该字符串的长度。
	 * 3.以此类推，通过循环完成查找，如果找不到就是-1，并对每次找到的用计数器记录。
	 */
	public static void main(String[] args)
	{
		String str = "nbaasdifoajsnbadiiinbajsdfinbajsdionbanba";
		String key = "nba";

		int count = getKeyStringCount_2(str, key);
		System.out.println("count=" + count);
	}

	private static int getKeyStringCount_2(String str, String key)
	{
		int count = 0;
		int index = 0;
		while ((index = str.indexOf(key,index))!=-1)
		{
			index = index + key.length();
			count++;
		}
		return count;
	}

	private static int getKeyStringCount(String str, String key)
	{
		// 1.定义计数器。
		int count = 0;

		// 2.定义变量记录key出现的位置。
		int index = 0;

		while ((index = str.indexOf(key)) != -1)
		{
			str = str.substring(index + key.length());
			count++;
		}
		return count;
	}

}
