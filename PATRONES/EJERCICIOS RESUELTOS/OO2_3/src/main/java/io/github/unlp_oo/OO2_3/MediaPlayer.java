package io.github.unlp_oo.OO2_3;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private List<Media> media;
	
	public MediaPlayer() {
		this.media = new ArrayList<Media>();
	}
	
	public void addMedia(Media media) {
		this.media.add(media);
	}
	
	public void play() {
		this.media.stream().forEach(m -> m.play());
	}
}
