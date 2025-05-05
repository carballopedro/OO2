package io.github.unlp_oo.OO2repasoEJ1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	// variables privadas del usuario
	private String screenName;
	private List<TweetGenerico> tweets;
	
	// constructor del usuario
	public Usuario (String screenName){
		this.screenName = screenName;
		this.tweets = new ArrayList<TweetGenerico>();
		
	}
	
	// getter del nombre de usuario
	public String getScreenName() {
		return this.screenName;
	}
	
	// getter de tweets
	public List<TweetGenerico> getTweets() {
		return this.tweets;
	}
	
	// verifica que longitud de texto sea entre 1 y 280
	private boolean verificarLongitudTexto (String texto) {
		int tam = texto.length();
		return (tam >= 1 && tam <=280);
	}
	
	// agrega tweet a lista de tweets si el texto tiene entre 1 y 280 caracteres
	public Tweet agregarTweet (String texto) {
		if (this.verificarLongitudTexto(texto) == true) {
			Tweet tweet = new Tweet(texto, this);
			this.tweets.add(tweet);
			return tweet;
		}
		else
			System.out.print("Tamaño de tweet erroneo.");
			return null;
	}
	
	// agregar retweet
	public ReTweet agregarReTweet (Tweet tweet) {
		ReTweet rt = new ReTweet(tweet);
		tweet.agregarRetweet(rt);
		this.tweets.add(rt);
		return rt;
	}
	
	// eliminar tweets
	public void eliminarTweets() {
		this.tweets.forEach(p -> p.eliminarPublicacion());
		this.tweets.clear();
	}
									
}
