
public class TestVar {

	int a; // 成员变量，会自行的初始化，数字为0，double为0.0，char为\u0000   bool为false
	// 成员变量从属于对象，初始化对象的时候，从属与那个初始化的new的对象。
	
	static int size; // 静态变量，从属于类。生命周期最长。
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ // 代码块，直接一个花括号就可以用
			int a = 32; 
		}
	}

}
