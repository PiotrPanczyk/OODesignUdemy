package clients;

import domain.Device;
import domain.Laptop;
import domain.Smartphone;

public class Manufacture {
	public static void main(String[] args) {
		Device phone = new Smartphone();
		Device laptop = new Laptop();
		
		phone.runProcess();
		laptop.runProcess();
	}
}
