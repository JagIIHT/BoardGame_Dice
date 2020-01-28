package com.game.type;

import com.game.input.GameInput;

public abstract class Game {

	public Game(GameInput input) {}

	public abstract void setGameInput();

	public abstract void playGame();

	public abstract void displayResults();
}
