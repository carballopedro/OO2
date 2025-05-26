package io.github.unlp_oo.OO2_18;

import java.time.LocalDate;

public class FileOO2 implements IFileOO2 {

	private String name;
	private String extension; 
	private double size;
	private LocalDate dateCreated;
	private LocalDate dateModified;
	private String permissions;
	
	// CONSTRUCTOR
	
	public FileOO2(String name, String extension, double size, LocalDate dateCreated, LocalDate dateModified,
			String permissions) {
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.permissions = permissions;
	}
	
	// PRETTY PRINT
	
	// siempre se muestra el nombre
	public String prettyPrint() {
		return this.getName();
	}
	
	// GETTERS
	
	public String getName() {
		return this.name;
	}

	public String getExtension() {
		return this.extension;
	}

	public String getSize() {
		return Double.toString(this.size);
	}

	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	public String getDateModified() {
		return this.dateModified.toString();
	}

	public String getPermissions() {
		return this.permissions;
	}

}
