package cn.p1.string.demo;

public class StringTest_3
{
	/*
	 * 3.两个字符串中的最大相同的字符串 qwerabcdtyuiop xcabcdvbn
	 */
	public static void main(String[] args)
	{
		String s1 = "qwerabcdtyuiop";
		String s2 = "xcabcdvbn";

		String s = getMaxSubstring(s1, s2);
		System.out.println("s=" + s);

	}

	private static String getMaxSubstring(String s1, String s2)
	{
		String max = null, min = null;
		max = (s1.length() > s2.length() ? s1 : s2);
		min = max.equals(s1) ? s2 : s1;
		for (int i = 0; i < min.length(); i++)
		{
			for (int a = 0, b = min.length() - i; b != min.length() + 1; a++, b++)
			{
				String sub = min.substring(a, b);
				if (max.contains(sub))
					return sub;
			}
		}
		return null;
	}
}
