package test.abstract1;

public class RunCar {

	public static void main(String[] args) {
		Lexus rx = new Lexus("Lexus");
		
		rx.showInfo();
		rx.drive();
		rx.stop();
		rx.turnLeft();
		rx.turnRight();
		
	}

}
