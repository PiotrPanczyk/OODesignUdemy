package domain;

public class TV implements Controlable {

	@Override
	public void turnDeviceOn() {
		System.out.println("Turning "+this.getClass().getName()+" on.");
		
	}

	@Override
	public void turnDeviceOff() {
		System.out.println("Turning "+this.getClass().getName()+" off.");
		
	}

}
