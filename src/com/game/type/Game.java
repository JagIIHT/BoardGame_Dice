package com.game.type;

import java.util.List;

import com.game.input.GameInput;

public abstract class Game {

	private GameInput input;
	int playersCount;
	List<String> boardPositions;
	List<String> diceNumbers;

	public Game(GameInput input) {
		this.input = input;
		setGameInput();
	}

	private void setGameInput() {
		this.playersCount = this.input.getPlayersCount();
		this.boardPositions = this.input.getBoardPositions();
		this.diceNumbers = this.input.getDiceNumbers();
	}
	
	public abstract void playGame();
	
	public abstract void displayResults();
}
