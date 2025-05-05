package io.github.unlp_oo.OO2_3;

public class VideoStreamAdapter extends Media {
	
	private VideoStream vs;
	
	public VideoStreamAdapter(VideoStream vs) {
		this.vs = vs;
	}
	
	public void play() {
		this.vs.reproduce();
	}
}
