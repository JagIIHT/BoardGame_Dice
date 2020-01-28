package com.game.application;

import com.game.input.DiceGameInput;
import com.game.type.DiceGame;
import com.game.type.Game;

public class GameApplication implements Application {

	private Game game;

	public GameApplication(String gameName) {
		if (gameName != null && gameName.equalsIgnoreCase("Dice")) {
			this.game = new DiceGame(new DiceGameInput());
		}
	}

	@Override
	public void runApp() {
		this.game.setGameInput();
		this.game.playGame();
		this.game.displayResults();
	}
}
