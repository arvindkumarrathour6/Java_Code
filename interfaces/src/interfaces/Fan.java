package interfaces;

public class Fan implements Combo{

	@Override
	public void sOn() {
		System.out.println("Fan Switch on");
		
	}

	@Override
	public void sOff() {
		System.out.println("Fan Switch Off");
		
	}

	@Override
	public void increasespeed() {
		System.out.println("Fan Speed Increase");
		
	}

	@Override
	public void decreasespeed() {
		System.out.println("Fan Speed Decrease");
		
	}
	

}
