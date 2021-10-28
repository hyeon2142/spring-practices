package com.douzone.container.videosystem;

public class IronMan implements DigitalVideoDisc {
	
	private String title = "ironMan";
	private String studio = "MARVEL";
	
	
	@Override
	public void play() {
		System.out.println("Playing Movie" + studio + "'s " + title);

	}

}
