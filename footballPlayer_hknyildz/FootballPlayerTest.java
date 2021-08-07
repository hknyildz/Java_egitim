package homework.footballPLayer;

public class FootballPlayerTest {
	public static void main(String[] args) {
		FootballPlayer alex = new FootballPlayer();
		alex.no=15;
		alex.name="Alex De Souz";
		alex.minutes=0;
		alex.inPlay= false;
		alex.numberOfGoals=0;
		alex.play(15);
		alex.score();
		alex.score();
	}

}
