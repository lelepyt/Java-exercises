package org.exercises.map.mapSort.impls;

import org.electroSort.interfaces.Electron;

public class Phone implements Electron {

	private String name;
	private int power;

	@Override
	public String sendName() {
		this.name = "Phone :";
		return this.name;

	}

	@Override
	public int sendPower() {
		this.power = 3;
		return this.power;

	}
}
