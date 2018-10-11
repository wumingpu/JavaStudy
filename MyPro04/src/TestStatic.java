/**
 * 静态对象测试
 * @author wmp
 *
 */
public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 静态的方法，变量从属于类，而不是属于对象。所以生命周期是和类共存亡的。
		// JVM的方法区相当于图纸，对象相当于车，有车，必然有图纸，但是有图纸，不一定有车。
		// 方法区里面存储的静态的属性和方法
		
		
		
	}
	
	/*
	 * 静态初始化块，先执行父类的初始化块，从最原始的类开始执行静态块。
	 */
	static { // 静态块 类加载的时候执行，优先于构造器
		System.out.println("abc");
	}

}
