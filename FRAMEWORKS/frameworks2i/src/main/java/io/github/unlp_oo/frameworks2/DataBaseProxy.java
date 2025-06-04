package io.github.unlp_oo.frameworks2;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;


public class DataBaseProxy implements DatabaseAccess {

	private DatabaseAccess realDatabase;
	private String key;
	private boolean loggedIn;
	
	// se agrega (ej 2)
	private static final Logger logger = Logger.getLogger (DataBaseProxy.class.getName());
	
	public DataBaseProxy (DatabaseAccess realDatabase, String key) {
		this.realDatabase = realDatabase;
		this.key = key;
		this.loggedIn = false;
	}
	
    @Override
    public Collection<String> getSearchResults(String queryString) {
    	if (this.loggedIn) {
    		// nivel info para búsquedas
    		logger.info("Acceso Valido");
			return this.realDatabase.getSearchResults(queryString);
		} 
    	else {
    		// nivel severe para acceso inválido
    		logger.severe("Acceso Invalido");
    		throw new IllegalArgumentException("El usuario no se encuentra registrado");
    	}
    }

    @Override
    public int insertNewRow(List<String> rowData) {
    	if (this.loggedIn) {
    		// nivel warning para inserciones
    		logger.warning("Acceso Valido");
			return this.realDatabase.insertNewRow(rowData);
    	}
    	else {
    		// nivel severe para acceso inválido
	    	logger.severe("Acceso Invalido");
	    	throw new IllegalArgumentException("El usuario no se encuentra registrado");
	    	}
    }
    
    // LOG IN
    public void login(String password) {
        if (this.loggedIn) {
            throw new RuntimeException("Sesión ya iniciada");
        }

        if (!this.key.equals(password)) {
            throw new RuntimeException("Contraseña inválida");
        }

        this.loggedIn = true;
    }
    
    // LOG OUT
    public void logOut() {
        if (!this.loggedIn) {
            throw new RuntimeException("Sesión sin iniciar");
        }

        this.loggedIn = false;
    }
}
