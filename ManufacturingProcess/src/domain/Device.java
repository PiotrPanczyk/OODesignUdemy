package domain;

public abstract class Device {
	protected abstract void assembly();
	protected abstract void testing();
	protected abstract void packaging();
	protected abstract void storage();
	
	// Template method pattern - abstract methods are implemented in sub-classes
	// but called in a method in abstract class. 
	// That defines the general process or flow. 
	// Defines program skeleton (behaviour) in a method.
	public void runProcess() {
		assembly();
		testing();
		packaging();
		storage();
		
	}

}
