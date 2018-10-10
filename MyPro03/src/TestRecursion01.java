/**
 * 测试递归
 * @author wmp
 *
 */
public class TestRecursion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long d1 = System.currentTimeMillis();
		System.out.printf("%d阶乘的结果%s%n", 10, factorial(10));
		long d2 = System.currentTimeMillis();
		// 递归由于大量打开方法，很消耗资源。比循环要慢很多。除非没有代替的方法，否则慎用。
		// 递归能完成的事情，都可以用循环解决。
			
	}
	
	static int count = 0;
	static void a() {
		System.out.println("a");
		count++;
		if(count<10) {
			a(); // 递归体
		}
		else {
			return; // 递归头
		}
	}
	
	static void b() {
		System.out.println("b");
	}
	
	static long factorial(int n) {
		if(n==1) { // 递归头，什么时候结束
			return 1;
		}
		else{ // 递归体，什么时候开始
			return n * factorial(n - 1);
		}
	}
	

}
