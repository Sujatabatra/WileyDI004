package com.sujata.demo;

public class Instrumentalist implements Performer {

	//dependency
	private Instrument instrument;
	
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing ");
		instrument.play();

	}

}
