
public class Sensor {
	double value;
	boolean state;
	
	public Sensor(double value,boolean state){
		this.value = value;
		this.state = state;
	}
	
	public double getValue(){
		return value;
	}
	
	public void setValue(double value){
		this.value = value;
	}
	
	public boolean getState(){
		return state;
	}
	
	public void setState(boolean state){
		this.state = state;
	}
}
