package Class2;

public class Circle {
	private int r; //반지름
	private double circum, area; //둘레, 면적
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getCircum() {
		return circum;
	}
	public double getArea() {
		return area;
	}
	
	//원의 면적
	public void calcArea() {
		area = Math.PI * Math.pow(r, 2);
	}
	
	//원의 둘레
	public void calcCircum() {
		circum = 2* Math.PI * r;
	}
}
