package com.example.demo.enumeration;

public enum Shift {
	
	Manual("Manual"), Automatic("Automatic"), Sequential("Sequential");

	private final String choice;

	// private enum constructor
	private Shift(String choice) {
		this.choice = choice;
	}

	public String getSub() {
		return choice;
	}
}

