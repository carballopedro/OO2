package io.github.unlp_oo.OO2repasoEJ1;

public class ReTweet extends TweetGenerico {
	
	private Tweet tweetOriginal;
	
	public ReTweet(Tweet tweet) {
		super(tweet.getUsuario());
		this.tweetOriginal = tweet;
	}
	
	// getter
	public Tweet getTweetOriginal() {
		return this.tweetOriginal;
	}
	
	// se elimina de la lista de retweets q tiene el tweet original
	public void eliminarPublicacion() {
		this.tweetOriginal.eliminarReTweet(this);
	}
	
	// deja en null la referencia al tweet original del usuario que fue borrado
	public void borrarTweet() {
		this.tweetOriginal = null;
	}
	
	// no deberia ponerle null al retweet. sino que los retweets deberian conocer al usuario que los retwitteo
	// y pedirle a ese usuario que los borre de su lista de publicaciones(tweets genericos en mi caso)
	
	// dejarle null al retweet genera "inconsistencia" de datos segun la ayudante xq tendrias un retweet que apunta a null
	// no deberias tenerlo directamente
	
	
}
