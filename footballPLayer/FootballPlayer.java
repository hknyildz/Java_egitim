package homework.footballPLayer;

public class FootballPlayer {
public int no;
String name;
boolean inPlay;
public int minutes;
int numberOfGoals;

	void play(int minutesToPlay) {	
		if(minutesToPlay>90)
		{  System.out.println("oyuncu 90 dakikadan fazla oynayamaz");  }
		else
		{  
			System.out.println("Oyuncu oyuna girdi");
			minutes+=minutesToPlay;
			inPlay=true;
		}
	}
	
	void score() {
		numberOfGoals++;
		System.out.println("GOAAAAAAAAAAALLL!!!!!");
		System.out.println("Oyuncunun gol sayısı= "+ numberOfGoals);
	}

}
