package test.overriding;

public class Bomb extends Weapon {
	
	@Override
	public void fire() {
		super.fire();
		System.out.println("½´¿ì¿õ~~ Æã");
	}
}
