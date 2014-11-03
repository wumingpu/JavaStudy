package cn.p2.wrapper.demo;

public class WrapperDemo2 {

	public static void main(String[] args) {
		int num = 4;

		Integer i = 4; // i = new Integer(4); jdk1.5后特性，自动装箱。简化书写
		i = i+6;//i = new Integer(i.intValue() + 6); // i.intValue() 自动拆箱
		
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		Integer x = 127; // 当变成128后，结果会变。jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被重新开辟空间不会共享。只有字节是这样的。
		Integer y = 127;
		
		System.out.println(x == y);
		System.out.println(x.equals(y));
		
	}

}
