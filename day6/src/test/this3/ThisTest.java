package test.this3;

public class ThisTest {
	
	public ThisTest() {
		System.out.println("ThisTest() 생성자가 호출됨.");
	}
	
	public ThisTest(int n) {
		System.out.println("ThisTest(int n) 생성자가 호출됨.");
	}
	
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
	}

}
