package com.sujata.demo;

public class Singer implements Performer {

	//dependency
	private String song;
	
	
	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is Singing "+song+"!");

	}

}
