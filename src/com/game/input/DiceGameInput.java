package com.game.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DiceGameInput implements GameInput {

	@Override
	public int getPlayersCount() {
		System.out.println("Enter players count - ");
		return Integer.parseInt(getConsoleValue());
	}

	@Override
	public List<String> getBoardPositions() {
//		System.out.println("Enter Board Positions - ");
//		return Arrays.asList(getConsoleValue().split(","));
		return Arrays.asList("E,E,E,T,H,T,J,J,E,H,T,H,E,E,E,E,E,E,E,E,E".split(","));
	}

	@Override
	public List<String> getDiceNumbers() {
//		System.out.println("Enter Dice numbers - ");
//		return Arrays.asList(getConsoleValue().split(","));
		return Arrays.asList("2,3,2,4,2,3,4,3,2,4,2".split(","));
	}

	private String getConsoleValue() {
		BufferedReader sc = new BufferedReader(new java.io.InputStreamReader(System.in));
		String input = "";
		try {
			input = sc.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}

}
