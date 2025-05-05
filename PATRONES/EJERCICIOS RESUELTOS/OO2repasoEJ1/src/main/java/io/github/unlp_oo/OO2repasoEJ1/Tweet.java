package io.github.unlp_oo.OO2repasoEJ1;

import java.util.ArrayList;
import java.util.List;

public class Tweet extends TweetGenerico {
	
	private String cuerpo;
	private List<ReTweet> retweets;
	
	public Tweet (String texto, Usuario usuario) {
		super(usuario);
		this.cuerpo = texto;
		this.retweets = new ArrayList<ReTweet>();
	}
	
	// necesito getter? tal vez para obtener el texto del tweet...
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public void agregarRetweet(ReTweet rt) {
		this.retweets.add(rt);
	}
	
	public void eliminarPublicacion() {
		this.retweets.forEach(r -> r.borrarTweet());
		this.retweets.clear();
	}

	public void eliminarReTweet(ReTweet rt) {
		this.retweets.remove(rt);
	}

}
