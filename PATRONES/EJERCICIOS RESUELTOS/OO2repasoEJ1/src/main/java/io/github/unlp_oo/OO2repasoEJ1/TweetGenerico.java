package io.github.unlp_oo.OO2repasoEJ1;

public abstract class TweetGenerico {
	
	private Usuario usuario;
	
	public TweetGenerico(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public abstract void eliminarPublicacion();
	
}
