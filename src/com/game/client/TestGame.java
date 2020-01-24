package com.game.client;

import com.game.application.GameApplication;
import com.game.input.DiceGameInput;
import com.game.type.DiceGame;
import com.game.type.Game;

public class TestGame {

	public static void main(String[] args) {
		
		System.out.println("Starting game");
		
		GameApplication app = new GameApplication();
		Game game = new DiceGame(new DiceGameInput());
		
		app.initializeGame(game);
		app.playGame();
		app.displayResults();
	}
}
