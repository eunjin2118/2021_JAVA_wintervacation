package test.access1;

public class AAA {
	public void test() {
		AccessBase ab = new AccessBase();
		//private �ʵ�� ���� ��Ű������ ������ �Ұ����ϴ�
		//System.out.println("n1(private) = "+ab.n1); 
		//public �ʵ�� ���� ��Ű������ ���� ����
		System.out.println("n2(public) = "+ ab.n2);
		//protected �ʵ�� ���� ��Ű������ ���� ����
		System.out.println("n3(protected) = "+ ab.n3);
		// default �ʵ�� ���� ��Ű������ ���� ����
		System.out.println("n4(default) = "+ ab.n4);
		
	}
}
