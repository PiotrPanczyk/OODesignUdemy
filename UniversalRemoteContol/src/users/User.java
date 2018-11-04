package users;

import domain.Projector;
import domain.SoundSystem;
import domain.TV;
import remotecontrol.RemoteControl;

public class User {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Projector projctor = new Projector();
		SoundSystem soundSys = new SoundSystem();
		TV tv = new TV();
		
		remote.chooseDevice(projctor);
		remote.turnOn();
		remote.turnOff();
		
		remote.chooseDevice(tv);
		remote.turnOn();
		remote.turnOff();
		
		remote.chooseDevice(soundSys);
		remote.turnOn();
		remote.turnOff();
	}

}
