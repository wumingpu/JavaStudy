package com.wmp.server.basic;

import java.lang.reflect.InvocationTargetException;

/**
 * 反射
 * 1. 获取class对象，每一个类都有class对象
 * 三种方式
 * 2. 可以动态创建对象
 * @author WMP
 *
 */
public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		// 三种方式
		// 1. 对象.getClass()
		Iphone iphone = new Iphone();
		Class clz = iphone.getClass();
		
		//2. 类.class（）
		clz = Iphone.class;
		
		// 3. Class.forName("包名。类名") 常用
		//    知道包名和类名的字符串，就可以new对象了。
		clz = Class.forName("com.wmp.server.basic.Iphone");
		
		//创建对象
//		Iphone iphone = (Iphone).clz.newInstance()
		Iphone iphone2 = (Iphone)clz.getConstructor().newInstance();
		System.out.println(iphone2);
	}

}
class Iphone{
	public Iphone() {}
}
