package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PackManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var marioGame = new MarioGame();
		var game = new SuperContraGame();
		var pacMan = new PackManGame();//1: object creation
		var gameRunner = new GameRunner(pacMan);//2: Object creation + wiring of Depedencies
		//Game is a Dependency of GameRunner
		gameRunner.run();
	}
	
	

}
