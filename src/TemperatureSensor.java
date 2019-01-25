

public class TemperatureSensor extends Sensor implements SensorI{
	
	public TemperatureSensor(double value, boolean state) {
		super(value, state);
		// TODO Auto-generated constructor stub
	}

	public boolean turnOn() {
		setState(true);
		return getState();
	}

	public double sensorValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean turnOff() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
