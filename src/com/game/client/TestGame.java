package com.game.client;

import com.game.application.GameApplication;

public class TestGame {

	public static void main(String[] args) {
		System.out.println("Starting game");
		GameApplication app = new GameApplication();
		app.initializeGame();
		app.playGame();
		app.displayResults();
	}
}
