package test.this3;

public class ThisTest {
	
	public ThisTest() {
		System.out.println("ThisTest() �����ڰ� ȣ���.");
	}
	
	public ThisTest(int n) {
		System.out.println("ThisTest(int n) �����ڰ� ȣ���.");
	}
	
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
	}

}
