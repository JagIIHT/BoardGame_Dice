package com.game.input;

import java.util.List;

public interface GameInput {

	/**
	 * @return
	 */
	int getPlayersCount();

	/**
	 * @return
	 */
	List<String> getBoardPositions();

	/**
	 * @return
	 */
	List<String> getDiceNumbers();
}
