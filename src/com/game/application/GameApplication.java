package com.game.application;

import com.game.input.DiceGameInput;
import com.game.input.GameInput;
import com.game.type.DiceGame;
import com.game.type.Game;

public class GameApplication {
	
	private Game game;
	private GameInput input;

	public void initializeGame() {
		this.input = new DiceGameInput();
		this.game = new DiceGame(input);
	}
	
	public void playGame() {
		this.game.playGame();
	}
	
	public void displayResults() {
		this.game.displayResults();
	}
}
