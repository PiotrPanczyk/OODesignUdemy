package domain;

public class Laptop  extends Device{
	@Override
	public void assembly() {
		System.out.println("Assembling "+this.getClass().getName());
		
	}

	@Override
	public void testing() {
		System.out.println("Testing "+this.getClass().getName());
		
	}

	@Override
	public void packaging() {
		System.out.println("Packaging "+this.getClass().getName());
		
	}

	@Override
	public void storage() {
		System.out.println("Storing "+this.getClass().getName());
		
	}

}
