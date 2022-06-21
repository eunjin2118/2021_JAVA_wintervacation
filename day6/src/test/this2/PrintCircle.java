package test.this2;

public class PrintCircle {

	//참조변수
	public static void print(Circle c) {
		System.out.printf("반지름이 %d㎝인 원의 둘레는  %.2f㎝이다.\n", c.getR(), c.getCircum());
		System.out.printf("반지름이 %d㎝인 원의 면적는  %.2f㎠이다.\n", c.getR(), c.getArea());
	}
	public static void main(String[] args) {
		Circle c = new Circle(2);
		c.showInfo();
		
		Circle c2 = new Circle(7);
		c2.showInfo();
		
		Circle c3 = new Circle(10);
	}

}
