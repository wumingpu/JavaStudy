/**
 * 
 * 测试字符型和bool类型
 * @author wmp
 *
 */
public class TestPremitiveDataType3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a = 'T';
		char b = '我';
		char c = '\u0061'; // 后面的数字是16进制的数字
		
		System.out.println(""+'a'+'b'); // 前面加一个字符串，后面的相加会变成ab,否则会变成字符十六进制中的的a和b相加。
		
		String d = "abc"; // String是字符序列
		
		
		boolean man = true; // 布尔类型占1位，而不是一个字节，java中和C不一样，不可以使用0或者或者非0代表true和false
	}

}
