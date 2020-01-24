package com.game.player;

import java.math.BigDecimal;

public class Player {

	private int position;
	private BigDecimal amount;
	private String positionHistory;
	private String name;

	public Player() {
		this.amount = new BigDecimal(1000);
		this.position = 1;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPositionHistory() {
		return positionHistory;
	}

	public void setPositionHistory(String positionHistory) {
		this.positionHistory = positionHistory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
