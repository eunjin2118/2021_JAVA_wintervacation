package test.this2;

public class PrintCircle {

	//��������
	public static void print(Circle c) {
		System.out.printf("�������� %d���� ���� �ѷ���  %.2f���̴�.\n", c.getR(), c.getCircum());
		System.out.printf("�������� %d���� ���� ������  %.2f���̴�.\n", c.getR(), c.getArea());
	}
	public static void main(String[] args) {
		Circle c = new Circle(2);
		c.showInfo();
		
		Circle c2 = new Circle(7);
		c2.showInfo();
		
		Circle c3 = new Circle(10);
	}

}
