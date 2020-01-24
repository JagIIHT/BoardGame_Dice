package com.game.type;

import java.util.Map;
import java.util.TreeMap;

import com.game.board.position.BoardValue;
import com.game.input.GameInput;
import com.game.player.Player;

public class DiceGame extends Game {

	private Player player;
	private Map<String, Player> players = new TreeMap<String, Player>();
	private boolean houseBought;

	public DiceGame(GameInput input) {
		super(input);
		generatePlayers();
	}

	private void generatePlayers() {
		for (int i = 0; i < this.playersCount; i++) {
			Player p = new Player();
			p.setName("Player-" + (i + 1));
			players.put("Player" + i, p);
		}
	}

	@Override
	public void displayResults() {
		this.players.entrySet().stream().forEach(k -> System.out.println(k.getValue().getName() + " has amount of "
				+ k.getValue().getAmount() + " and went through positions - " + k.getValue().getPositionHistory()));

	}

	private void setCurrentPlayer(int index) {
		this.player = this.players.get("Player" + index);
	}

	@Override
	public void playGame() {
		playersInitialPositionCalc();
		for (int i = 1; i <= this.diceNumbers.size(); i++) {
			setCurrentPlayer((i - 1) % this.playersCount);
			this.player.setPosition(this.player.getPosition() + Integer.valueOf(this.diceNumbers.get(i - 1)));
			String position = newPosition();
			player.setPositionHistory(player.getPositionHistory() + "," + position);
			calculatePlayersAmount(position);
		}
	}

	private void playersInitialPositionCalc() {
		this.players.entrySet().stream().forEach(pair -> {
			this.player = pair.getValue();
			this.player.setPositionHistory(this.boardPositions.get(0));
			calculatePlayersAmount(this.boardPositions.get(0));
		});
	}

	private String newPosition() {
		String newPosition = this.boardPositions.get(((this.player.getPosition()) % this.boardPositions.size()) - 1);
		return newPosition;
	}

	private void calculatePlayersAmount(String position) {
		BoardValue bv = BoardValue.EMPTY;
		if (position.equalsIgnoreCase(BoardValue.TREASURE.getCellType())) {
			bv = BoardValue.TREASURE;
		} else if (position.equalsIgnoreCase(BoardValue.HOTEL.getCellType())) {
			bv = BoardValue.HOTEL;
			if (!this.houseBought) {
				bv = BoardValue.HOTELBUY;
				this.houseBought = true;
			}
		} else if (position.equalsIgnoreCase(BoardValue.JAIL.getCellType())) {
			bv = BoardValue.JAIL;
		}
		this.player.setAmount(this.player.getAmount().add(bv.getValue()));
	}
}
