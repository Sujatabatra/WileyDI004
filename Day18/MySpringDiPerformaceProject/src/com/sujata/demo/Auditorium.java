package com.sujata.demo;

public class Auditorium {

	// dependency
	private Performer performer;

	public Auditorium(Performer performer) {
		super();
		this.performer = performer;
	}

	public void act() {

		performer.perform();
	}
}
