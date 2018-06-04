package com.util.javapractice.dailyP_0301.immutable;

public final class Immutable {

	private final int id;

	private final String name;

	public Immutable(int ID, String NAME) {
		this.id = ID;
		this.name = NAME;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
