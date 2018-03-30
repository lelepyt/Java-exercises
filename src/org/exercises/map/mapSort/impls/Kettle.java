package org.exercises.map.mapSort.impls;

import org.electroSort.interfaces.Electron;

public class Kettle implements Electron {

	private String name;
	private int power;

	@Override
	public String sendName() {
		this.name = "Kettle :";
		return this.name;

	}

	@Override
	public int sendPower() {
		this.power = 1;
		return this.power;

	}
}
