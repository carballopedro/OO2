package io.github.unlp_oo.OO2_18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {

	private IFileOO2 file;
	private IFileOO2 name;
	private IFileOO2 extension;
	private IFileOO2 size;
	private IFileOO2 dateCreated;
	private IFileOO2 permissions;
	
	@BeforeEach
	void setUp() throws Exception {
		this.file = new FileOO2 ("Bohemian Rhapsody", ".mp3", 10.5, LocalDate.of(2024, 5, 20), LocalDate.of(2024, 6, 05), "rwxr-xr-x");
	}
	
	@Test
	void testPrettyPrintOption1() { 
		//name - extension
		this.name = new NameDecorator(this.file);  
		this.extension = new ExtensionDecorator(this.name);
		
		assertEquals("Bohemian Rhapsody - .mp3",this.extension.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption2() { 
		// name - dateCreated - extension
		this.name = new NameDecorator(this.file);  
		this.dateCreated = new DateCreatedDecorator(this.name);
		this.extension = new ExtensionDecorator(this.dateCreated);
		
		assertEquals("Bohemian Rhapsody - 2024-05-20 - .mp3",this.extension.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption3() { 
		// name - size - permissions - extension
		this.name = new NameDecorator(this.file);  
		this.size = new SizeDecorator(this.name);
		this.permissions = new PermissionsDecorator(this.size);
		this.extension = new ExtensionDecorator(this.permissions);
		
		assertEquals("Bohemian Rhapsody - 10.5MB - rwxr-xr-x - .mp3",this.extension.prettyPrint());
	}
}
