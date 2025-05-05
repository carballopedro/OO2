package io.github.unlp_oo.OO2_6;

public abstract class EstadoInscripcion {

	public abstract void inscribir(Excursion e, User user);
	public abstract String getInformation(Excursion e);
	
}


// me conviene dejar el metodo vacio y que lo redefina quien quiera
// o hacerlo abstracto y que todos lo tengan que redefinir asi lo dejen vacio en la clase concreta?

// el state deberia conocer a su contexto como variable de instancia o esta bien que venga como parametro?


// al no tener nada en comun, debería ser una interfaz? o respeto el patron y dejo la clase abstracta?