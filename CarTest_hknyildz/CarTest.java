package homework.CarTest_hknyildz;
import java.util.Random;

public class CarTest {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.name="Ford";
		car1.model="Ranger";
		Random r = new Random();
		int a=r.nextInt(1000)+100;
		car1.serialNumber=a*100;
		car1.year=2008;
		car1.distance=36420;
		car1.maxSpeed=260;
		
		System.out.println("new distance= "+car1.go(300));
		car1.accelarate(136);
		
		
		
	}

}
