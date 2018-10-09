/**
 * 测试键盘输入
 * @author wmp
 *
 */
import java.util.Scanner;;
public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String name = scanner.nextLine();
		System.out.println("请输入你的爱好");
		String favor = scanner.nextLine();
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		
	}

}
