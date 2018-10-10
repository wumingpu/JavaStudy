
/**
 * 方法的基本使用
 * @author wmp
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.printSxt();
		tm.printSxt();
		
		int c= tm.add(30, 40, 50) + 1000;
		System.out.println(c);
	}
	void printSxt() {
		System.out.println("123123123");
	}
	
	int add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
		return sum; // return两个作用，1.结束方法运行，2.返回值
	}
}
