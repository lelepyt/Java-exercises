package org.exercises.map.mapSort.impls;

import org.electroSort.interfaces.Electron;

public class Microwave implements Electron {

	private String name;
	private int power;

	@Override
	public String sendName() {
		this.name = "Microwave :";
		return this.name;

	}

	@Override
	public int sendPower() {
		this.power = 2;
		return this.power;

	}
}
