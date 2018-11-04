package domain;

public class Projector implements Controlable {

	@Override
	public void turnDeviceOn() {
		System.out.println("Turning "+this.getClass().getName()+" on.");
		
	}

	@Override
	public void turnDeviceOff() {
		System.out.println("Turning "+this.getClass().getName()+" off.");
		
	}

}
