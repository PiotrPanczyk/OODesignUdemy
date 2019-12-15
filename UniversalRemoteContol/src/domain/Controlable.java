package domain;

/*
 * Strategy pattern, create interface and execute functionality
 * using interface type.
 * This way there may be many implementations of given functionality
 * for given case.
 */
public interface Controlable {
	public abstract void turnDeviceOn();
	public abstract void turnDeviceOff();
}
