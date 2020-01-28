package com.game;

import com.game.application.Application;
import com.game.application.GameApplication;

public class TestGame {

	public static void main(String[] args) {

		System.out.println("Starting Application");

		Application app = new GameApplication("Dice");
		app.runApp();
	}
}
