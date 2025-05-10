package io.github.unlp_oo.OO2_12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFileSystem {

	private FileSystem fileSystem;
    private Directory root;
    private File archivoA;
    private File archivoB;
    private File archivoC;
    private Directory dirB;
    private Directory dirD;

    @BeforeEach
    public void setUp() {
        root = new Directory("Root", LocalDate.of(2023, 1, 1));
        archivoA = new File("doc1", LocalDate.of(2023, 2, 1), 100);
        dirB = new Directory("FolderB", LocalDate.of(2023, 3, 1));
        archivoB = new File("doc2", LocalDate.of(2023, 4, 1), 200);
        dirD = new Directory("FolderD", LocalDate.of(2023, 5, 1));
        archivoC = new File("doc1", LocalDate.of(2023, 6, 1), 50);

        // Estructura:
        // Root
        // ├── doc1 (100 bytes, 2023-02-01)
        // ├── FolderB
        // │   └── doc2 (200 bytes, 2023-04-01)
        // └── FolderD
        //     └── doc1 (50 bytes, 2023-06-01)

        root.addComponent(archivoA);
        root.addComponent(dirB);
        root.addComponent(dirD);
        dirB.addComponent(archivoB);
        dirD.addComponent(archivoC);

        fileSystem = new FileSystem(root);
    }

    @Test
    public void testGetTotalSize() {
        // Tamaño esperado: 32 (Root) + 100 (doc1) + 32 (FolderB) + 200 (doc2) + 32 (FolderD) + 50 (doc1) = 446
        assertEquals(446, fileSystem.getTotalSize());
    }
    
    @Test
    public void testGetTotalSizeEmptyDirectory() {
        // Sistema con un solo directorio vacío
        FileSystem emptyFileSystem = new FileSystem(new Directory("Empty", LocalDate.now())); 
        assertEquals(32, emptyFileSystem.getTotalSize());
    }
    

    @Test
    public void testGetLargestFile() {
        // El archivo más grande es doc2 (200 bytes)
        File largest = fileSystem.getLargestFile();
        assertNotNull(largest);
        assertEquals("doc2", largest.getName());
        assertEquals(200, largest.getSize());
    }

    @Test
    public void testGetLargestFileNoFiles() {
        // Sistema con un solo directorio vacío
        FileSystem emptyFileSystem = new FileSystem(new Directory("Empty", LocalDate.now())); 
        assertNull(emptyFileSystem.getLargestFile());
    }
    

    @Test
    public void testGetNewestFile() {
        // El archivo más nuevo es doc1 en FolderD (2023-06-01)
        File newest = fileSystem.getNewestFile();
        assertNotNull(newest);
        assertEquals("doc1", newest.getName());
        assertEquals(LocalDate.of(2023, 6, 1), newest.getDateCreated());
    }

    @Test
    public void testGetNewestFileNoFiles() {
        // Sistema con un solo directorio vacío
        FileSystem emptyFileSystem = new FileSystem(new Directory("Empty", LocalDate.now())); 
        assertNull(emptyFileSystem.getNewestFile());
    }
    
    @Test
    public void testBuscarArchivoPrimerNivel() {
        // Buscar doc1 en el primer nivel
        Component found = fileSystem.search("doc1");
        assertNotNull(found);
        assertEquals("doc1", found.getName());
        assertEquals(100, found.getSize());
    }

    @Test
    public void testBuscarDirectorio() {
        // Buscar FolderB
        Component found = fileSystem.search("FolderB");
        assertNotNull(found);
        assertEquals("FolderB", found.getName());
        assertTrue(found instanceof Directory);
    }

    @Test
    public void testBuscarNoExistente() {
        // Buscar un nombre que no existe
        Component found = fileSystem.search("noexiste");
        assertNull(found);
    }



    @Test
    public void testBuscarTodos() {
        // Buscar todos los elementos con nombre "doc1" (dos archivos)
        List<Component> found = fileSystem.searchAll("doc1");
        assertEquals(2, found.size());
        assertTrue(found.stream().anyMatch(e -> e.getName().equals("doc1") && e.getSize() == 100));
        assertTrue(found.stream().anyMatch(e -> e.getName().equals("doc1") && e.getSize() == 50));
    }

    @Test
    public void testBuscarTodosNoExistente() {
        // Buscar un nombre que no existe
        List<Component> encontrados = fileSystem.searchAll("noexiste");
        assertTrue(encontrados.isEmpty());
    }

    @Test
    public void testBuscarTodosUnSoloElemento() {
        // Buscar FolderB (un solo directorio)
        List<Component> found = fileSystem.searchAll("FolderB");
        assertEquals(1, found.size());
        assertEquals("FolderB", found.get(0).getName());
    }

    
    @Test
    public void testListadoDeContenido() {
        // Verificar el listado completo
        String esperado = "/Root\n" +
                         "/Root/doc1\n" +
                         "/Root/FolderB\n" +
                         "/Root/FolderB/doc2\n" +
                         "/Root/FolderD\n" +
                         "/Root/FolderD/doc1\n";
        assertEquals(esperado, fileSystem.contentList());
    }

    @Test
    public void testListadoDeContenidoSoloRoot() {
        // Sistema con un solo directorio
        FileSystem singleDir = new FileSystem(new Directory("Root", LocalDate.now())); 
        assertEquals("/Root\n", singleDir.contentList());
    }
 
}
