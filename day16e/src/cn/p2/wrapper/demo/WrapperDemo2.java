package cn.p2.wrapper.demo;

public class WrapperDemo2 {

	public static void main(String[] args) {
		int num = 4;

		Integer i = 4; // i = new Integer(4); jdk1.5�����ԣ��Զ�װ�䡣����д
		i = i+6;//i = new Integer(i.intValue() + 6); // i.intValue() �Զ�����
		
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		Integer x = 127; // �����128�󣬽����䡣jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���¿��ٿռ䲻�Ṳ����ֻ���ֽ��������ġ�
		Integer y = 127;
		
		System.out.println(x == y);
		System.out.println(x.equals(y));
		
	}

}