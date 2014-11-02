package cn.p1.stringbuffer.test;

public class StringBuilderTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr = {3,1,5,3,8};
		String s = arrayToString_2(arr);
		System.out.println(s);
	}
	
	/**
	 * 
	 * @param arr
	 * @return
	 */
	private static String arrayToString_2(int[] arr)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++)
		{
			if(i!=arr.length-1)
				sb.append(arr[i]+", ");
			else
				sb.append(arr[i]+"]");
		}
		return sb.toString();
	}
	
	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static String arrayToString(int[] arr)
	{
		String str = "[";
		for (int i = 0; i < arr.length; i++)
		{
			if(i!=arr.length-1)
				str+=arr[i]+", ";
			else
				str+=arr[i]+"]";
		}
		return str;
	}

}
