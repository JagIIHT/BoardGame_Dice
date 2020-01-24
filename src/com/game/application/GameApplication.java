package com.game.application;

import com.game.type.Game;

public class GameApplication {

	private Game game;

	public void initializeGame(Game game) {
		this.game = game;
	}

	public void playGame() {
		this.game.playGame();
	}

	public void displayResults() {
		this.game.displayResults();
	}
}
