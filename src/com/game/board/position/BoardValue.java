package com.game.board.position;

import java.math.BigDecimal;

public enum BoardValue {

	HOTEL("H", new BigDecimal(-50)), JAIL("J", new BigDecimal(-100)), EMPTY("E", new BigDecimal(0)), TREASURE("T", new BigDecimal(100)), HOTELBUY("HB", new BigDecimal(-100));
	
	private String cellType;
	private BigDecimal value;
	
	BoardValue(String cellType, BigDecimal value) {
		this.cellType = cellType;
		this.value = value;
	}
	
	public String getCellType() {
		return cellType;
	}

	public BigDecimal getValue() {
		return value;
	}
}
