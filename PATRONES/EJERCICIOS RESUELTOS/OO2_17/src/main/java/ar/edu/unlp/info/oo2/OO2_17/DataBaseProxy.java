package ar.edu.unlp.info.oo2.OO2_17;

import java.util.Collection;
import java.util.List;

public class DataBaseProxy implements DatabaseAccess {

	private DatabaseAccess realDatabase;
	private String key;
	private boolean loggedIn;
	
	public DataBaseProxy (DatabaseAccess realDatabase, String key) {
		this.realDatabase = realDatabase;
		this.key = key;
		this.loggedIn = false;
	}
	
    @Override
    public Collection<String> getSearchResults(String queryString) {
    	if (this.loggedIn) {
			return this.realDatabase.getSearchResults(queryString);
		} 
		throw new IllegalArgumentException("El usuario no se encuentra registrado");
    }

    @Override
    public int insertNewRow(List<String> rowData) {
    	if (this.loggedIn) {
			return this.realDatabase.insertNewRow(rowData);
		}
		throw new IllegalArgumentException("El usuario no se encuentra registrado");
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
