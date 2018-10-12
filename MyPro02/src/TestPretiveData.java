
public class TestPretiveData {

	
	/**
	 * 测试基本数据类型
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a  = 15; //十进制
		int b = 015; //八进制， 0开头
		int x = 0x15; // 十六进制，0x开头
		int d = 0b1101; // 二进制0b开头
		
		byte age = 30; // byte，-128 to 127
		short salary = 30000; // -三万到+三万
		int aaaa = 200000000; // 整形常量默认是int类型，也就是写个数字，默认就会被认为是int类型。范围为正负21亿
		long bbbb = 74000000000L; //注意后面需要加一个L，范围是2的64次方，基本是个数字都够了。
		
	}

}
