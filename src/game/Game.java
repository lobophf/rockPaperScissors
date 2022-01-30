package game;

import java.util.Random;
import java.util.Scanner;

public class Game{

	private Hand[] m_hand = {new Rock(), new Paper(), new Scissor()};
	public void run(){

		String[] status = {"lose", "draw", "win"};
		Random random = new Random();
		Scanner input = new Scanner(System.in);

		int score = 0;
		for(int i = 0; i < 3; i++){
			Hand obj1 = m_hand[random.nextInt(m_hand.length)];
			System.out.println("Choose an object.");
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissor");
			System.out.print("> ");

			int objectIndex = input.nextInt();
			Hand obj2 = m_hand[objectIndex - 1];

			System.out.println("You chose: " + obj2);
			System.out.println("The computer chose: " + obj1);
			int result = obj2.compareTo(obj1);
			System.out.println(status[result + 1]);
			score += result;
			System.out.println('\n');
		}
		input.close();

		if(score > 0){
			System.out.println("You have won!");
		}else if (score < 0){
			System.out.println("You have lose!");
		}else{
			System.out.println("It's a draw");
		}
	}

}
