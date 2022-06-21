package test.access1;

public class AAA {
	public void test() {
		AccessBase ab = new AccessBase();
		//private 필드는 같은 패키지에서 접근이 불가능하다
		//System.out.println("n1(private) = "+ab.n1); 
		//public 필드는 같은 패키지에서 접근 가능
		System.out.println("n2(public) = "+ ab.n2);
		//protected 필드는 같은 패키지에서 접근 가능
		System.out.println("n3(protected) = "+ ab.n3);
		// default 필드는 같은 패키지에서 접근 가능
		System.out.println("n4(default) = "+ ab.n4);
		
	}
}
