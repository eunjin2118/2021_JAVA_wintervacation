package test.access2;

//���� Ŭ������ �ٸ��� import�ؾ߸� ��� �����ϴ�
import test.access1.AccessBase;

public class BBB {
	public void test() {
		AccessBase ab = new AccessBase();
		//private �ʵ�� �ٸ� ��Ű������ ������ �Ұ����ϴ�
		//System.out.println("n1(private) = "+ab.n1); 
		//public �ʵ�� �ٸ� ��Ű������ ���� ����
		System.out.println("n2(public) = "+ ab.n2);
		//protected �ʵ�� �ٸ� ��Ű������ ���� �Ұ���
		//System.out.println("n3(protected) = "+ ab.n3);
		// default �ʵ�� �ٸ� ��Ű������ ���� �Ұ���
		//System.out.println("n4(default) = "+ ab.n4);
	}
}
