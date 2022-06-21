package test.this2;

public class Circle {
	private int r;
	private double circum, area;
	
	public Circle(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public double getCircum() {
		return circum;
	}

	public double getArea() {
		return area;
	}
	
	//�������� r�� ���� �ѷ� ����ϴ� �޼ҵ�
	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}

	//�������� r�� ���� �ѷ� ����ϴ� �޼ҵ�
	public void calcArea() {
		area = Math.PI * Math.pow(r, 2);  //�����ϴ� �Լ� Math.pow()
	}
	
	public void showInfo() {
		calcCircum();
		calcArea();
		PrintCircle.print(this);  //���� circle��ü �ּ�rkqt -> this
	}

}
