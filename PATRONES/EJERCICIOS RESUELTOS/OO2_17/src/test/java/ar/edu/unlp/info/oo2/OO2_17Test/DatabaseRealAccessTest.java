package ar.edu.unlp.info.oo2.OO2_17Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.OO2_17.DataBaseProxy;
import ar.edu.unlp.info.oo2.OO2_17.DatabaseAccess;
import ar.edu.unlp.info.oo2.OO2_17.DatabaseRealAccess;

public class DatabaseRealAccessTest {
    private DatabaseAccess realDatabase;
    private DataBaseProxy proxy;
    private final String correctKey = "secureKey123";
    private final String incorrectKey = "wrongKey";

    @BeforeEach
    void setUp() {
        realDatabase = new DatabaseRealAccess();
        proxy = new DataBaseProxy(realDatabase, correctKey);
    }
    
    // Tests for DatabaseRealAccess
    @Test
    void testGetSearchResultsExistingRecord() {
        Collection<String> result = realDatabase.getSearchResults("select * from comics where id=1");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), result);
    }

    @Test
    void testGetSearchResultsNonExistingRecord() {
        Collection<String> result = realDatabase.getSearchResults("select * from comics where id=999");
        assertTrue(result.isEmpty());
    }

    @Test
    void testInsertNewRow() {
        int id = realDatabase.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
        assertEquals(3, id);
        Collection<String> result = realDatabase.getSearchResults("select * from comics where id=3");
        assertEquals(Arrays.asList("Patoruzú", "La flor"), result);
    }
    
    // Tests for DatabaseProxy
    @Test
    void testSuccessfulLogin() {
        assertDoesNotThrow(() -> proxy.login(correctKey));
    }

    @Test
    void testFailedLoginWrongPassword() {
        Exception exception = assertThrows(RuntimeException.class, () -> 
            proxy.login(incorrectKey));
        assertEquals("Contraseña inválida", exception.getMessage());
    }

    @Test
    void testDoubleLogin() {
        proxy.login(correctKey);
        Exception exception = assertThrows(RuntimeException.class, () -> 
            proxy.login(correctKey));
        assertEquals("Sesión ya iniciada", exception.getMessage());
    }

    @Test
    void testSuccessfulLogout() {
        proxy.login(correctKey);
        assertDoesNotThrow(() -> proxy.logOut());
    }

    @Test
    void testLogoutWithoutLogin() {
        Exception exception = assertThrows(RuntimeException.class, () -> 
            proxy.logOut());
        assertEquals("Sesión sin iniciar", exception.getMessage());
    }

    @Test
    void testGetSearchResultsWhenLoggedIn() {
        proxy.login(correctKey);
        Collection<String> result = proxy.getSearchResults("select * from comics where id=1");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), result);
    }

    @Test
    void testGetSearchResultsWhenNotLoggedIn() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            proxy.getSearchResults("select * from comics where id=1"));
        assertEquals("El usuario no se encuentra registrado", exception.getMessage());
    }

    @Test
    void testInsertNewRowWhenLoggedIn() {
        proxy.login(correctKey);
        int id = proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
        assertEquals(3, id);
        Collection<String> result = proxy.getSearchResults("select * from comics where id=3");
        assertEquals(Arrays.asList("Patoruzú", "La flor"), result);
    }

    @Test
    void testInsertNewRowWhenNotLoggedIn() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals("El usuario no se encuentra registrado", exception.getMessage());
    }

}