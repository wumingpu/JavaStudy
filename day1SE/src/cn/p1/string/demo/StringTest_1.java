package cn.p1.string.demo;

/*
 * 1. 给定一个字符串数组。按照字典顺序进行从小到大的排序
 * {"nba","abc","abc","zz","qq","haha"}
 */
public class StringTest_1
{

	public static void main(String[] args)
	{
		String[] strArr = { "nba", "abc", "abc", "zz", "qq", "haha" };

		printArray(strArr);

		sortArray(strArr);

		printArray(strArr);
	}

	private static void sortArray(String[] strArr)
	{
		for (int i = 0; i < strArr.length - 1; i++)
		{
			for (int j = i + 1; j < strArr.length; j++)
			{
				if (strArr[i].compareTo(strArr[j]) > 0)
					swap(strArr, i, j);
			}

		}
	}

	private static void swap(String[] strArr, int i, int j)
	{
		// TODO Auto-generated method stub
		String temp;
		temp = strArr[i];
		strArr[i] = strArr[j];
		strArr[j] = temp;
	}

	private static void printArray(String[] strArr)
	{
		System.out.print('{');
		for (int i = 0; i < strArr.length; i++)
		{
			if (i != strArr.length - 1)
				System.out.print(strArr[i] + ',');
			else
				System.out.println(strArr[i] + '}');
		}
	}
}
