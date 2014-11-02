package cn.p1.stringbuffer.demo;
/*
 *  StringBuilder��StringBuffer����ͬ���ܵ������ࡣ
 *  StringBuilder�̲߳���ȫ������֤�߳�ͬ������StringBuffer�Ǳ�֤ͬ����
 *  StringBuilder��JDK1.5�ų��֣���Ϊ�̲߳���ȫ�������ٶȸ��죬�Ƽ�ʹ��StringBuilder
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
		 * StringBuffer:�����ַ��������� ���ڴ洢���ݵ�����
		 * 1.�����ǿɱ��
		 * 2.���Դ洢��ͬ���͵�����
		 * 3.����Ҫת���ַ�������ʹ��
		 * 4.���Զ��ַ�����������
		 * 
		 * ɾ��
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
		// ��ջ�������
		sb.delete(0, sb.length());
		//�滻
		sb.replace(1, 3, "nba");
		sb.setCharAt(2, 'q');
		
		//�ַ�����ת
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
