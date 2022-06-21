package test.access2;

//서로 클래스가 다르면 import해야만 사용 가능하다
import test.access1.AccessBase;

public class BBB {
	public void test() {
		AccessBase ab = new AccessBase();
		//private 필드는 다른 패키지에서 접근이 불가능하다
		//System.out.println("n1(private) = "+ab.n1); 
		//public 필드는 다른 패키지에서 접근 가능
		System.out.println("n2(public) = "+ ab.n2);
		//protected 필드는 다른 패키지에서 접근 불가능
		//System.out.println("n3(protected) = "+ ab.n3);
		// default 필드는 다른 패키지에서 접근 불가능
		//System.out.println("n4(default) = "+ ab.n4);
	}
}
