package remotecontrol;

import domain.Controlable;

public class RemoteControl {
	private Controlable device;
	public void chooseDevice(Controlable device) {
		this.device = device;
		
	}
	
	public void turnOn() {
		device.turnDeviceOn();
	}
	
	public void turnOff() {
		device.turnDeviceOff();
	}

}
