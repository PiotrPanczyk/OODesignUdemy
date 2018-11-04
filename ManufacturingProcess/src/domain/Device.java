package domain;

public abstract class Device {
	protected abstract void assembly();
	protected abstract void testing();
	protected abstract void packaging();
	protected abstract void storage();
	
	// Template method pattern - abstract methods are defined in sub-classes
	// but called in abstract class and defines the general process or flow. 
	// Defines program skeleton (behaviour) in a method.
	public void runProcess() {
		assembly();
		testing();
		packaging();
		storage();
		
	}

}
