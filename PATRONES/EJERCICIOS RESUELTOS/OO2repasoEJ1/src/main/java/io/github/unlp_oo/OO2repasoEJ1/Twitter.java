package io.github.unlp_oo.OO2repasoEJ1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	// constructor de twitter
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	
	// verifica que el nombre de usuario no exista
	private boolean verificarNombreUsuario (String screenName) {
		return this.usuarios.stream().noneMatch(usuario -> usuario.getScreenName().equals(screenName)); 
	}
	
	// preguntar: es necesario devolver el usuario? o puedo hacer un metodo public void agregarUsuario?
	public Usuario agregarUsuario(String screenName) {
		if (this.verificarNombreUsuario(screenName) == true) {
			Usuario u = new Usuario (screenName);
			this.usuarios.add(u);
			return u;
		}
		System.out.print("El screenName del usuario ya existe.");
		return null;
	}
	
	// getter de usuarios
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}
	
	// elimina tweets de usuario y usuario
	public void eliminarUsuario(Usuario usuario) {
		usuario.eliminarTweets();
		this.usuarios.remove(usuario);
	}

	// para acordarme:
	// al eliminar un usuario, no solo se eliminan sus tweets y sus retweets, sino que tambien a cada tweet
	// se le dice que vaya a su lista de retweets y se pongan en null
	
	// es mas eficiente que recorrer todos los usuarios y fijarme si tienen algun retweet del usuario a borrar
	// aunque tambien seria otra solucion posible
	
}
