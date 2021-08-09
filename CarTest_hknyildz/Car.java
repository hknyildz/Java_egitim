package homework.CarTest_hknyildz;

public class Car {

	String model;
	String name;
	int serialNumber;
	int year;
	double speed;
	int distance;
	int maxSpeed;
	
	public double go(int newDistance) {
		
		distance+=newDistance;
		
		return distance;
	}
	
	public void accelarate(int accelarate)
	{
		
		if(accelarate>maxSpeed) {
			System.out.println("This car cant go that fast!");
		}
		else {
			speed=accelarate;
			double time = (1000/speed);
			System.out.println("new speed is: "+speed);
			System.out.println("you will be finish 1000km after "+time+" hours.");
		}
		
	}
	
	public void stop() {
		speed=0;
		System.out.println("the car has stopped");
	}
	
	
}
