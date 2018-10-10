
class Point{
	double x, y, z;
	
	public Point(double _x, double _y) {
		// 构造方法的第一句始终是super(), 即使不写，则编译器也会自动加上。
		x = _x;
		y = _y;
	}
	
	public Point(double _x, double _y, double _z) {
		this(_x, _y); // this的用法，可以调用构造器，this指的是当前构造器。
		// 一个构造器调用另外一个构造器，需要把这一句调用放在第一句。
		this.z = _z; // this的另外一个方法，指的是当前的对象。
		// static类中不能用this，因为静态类不会产生对象，this只能用在对象中。所以不能用。
	}
	
	public double getDistance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)-(y-p.y)*(y-p.y));
	}
}

public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(3.0, 4.0);
		Point origin = new Point(0.0, 0.0);
		System.out.println(p.getDistance(origin));
	}

}
