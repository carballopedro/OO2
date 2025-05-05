package io.github.unlp_oo.OO2repasoEJ1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	
	// Declaraciones
	Usuario u;
	Usuario u2;
	Tweet t1;
	Tweet t2;
	Tweet t3;
	String s1;
	String s2;
	String s3;
	
	ReTweet rt;
	
	// Instanciaciones
	@BeforeEach
	void setUp(){
		this.u = new Usuario("Pedro");
		// 0 caracteres
		this.s1 = new String("");
		// 281 caracteres
		this.s2 = new String ("textotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotextotexto");
		// caracteres entre 1 y 280
		this.s3 = new String ("Texto");
		this.t1 = new Tweet(s1, u2);
		this.t2 = new Tweet(s2, u2);
		this.t3 = new Tweet(s3, u2);
		
		this.rt = new ReTweet(t3);
		
		this.u2 = new Usuario("Juan");
		u2.agregarTweet(s3);
	}
	
	
	// Tests
	@Test
	void testAgregarTweet() {
		// agregar tweet con 0 caracteres = null
		assertEquals(null, u.agregarTweet(s1));
		// agregar tweet con 281 caracteres = null
		assertEquals(null, u.agregarTweet(s2));
		// agregar tweet con cant caracteres aceptada = devuelve un Tweet
		assertEquals(t3.getClass(), u.agregarTweet(s3).getClass());
	}
	
	@Test
	void testAgregarReTweet() {
		// agregar retweet
		assertEquals(rt.getClass(), u.agregarReTweet(t3).getClass());
	}
	
	@Test
	void testEliminarTweets() {
		// usuario tiene 1 tweet
		assertEquals(false, u2.getTweets().isEmpty());
		
		// se eliminan tweets. usuario queda sin tweets
		u2.eliminarTweets();
		assertEquals(true, u2.getTweets().isEmpty());
	}
	
	
}
