package test.final1;

//final 클래스는 자식클래스가 없다(다른 클래스가 상속을 받을 수 없다)(상속금지)
public /*final*/ class Parent {
	//부모 클래스의 final메소드는 재정의 할 수 없다.(오버라이딩 금지)
	public /*final*/void rest() {
		System.out.println("10분간 휴식한다");
	}
}
