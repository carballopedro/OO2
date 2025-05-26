package io.github.unlp_oo.OO2_18;

public abstract class FileDecorator implements IFileOO2 {
	
	private IFileOO2 component;

	public FileDecorator(IFileOO2 realFile) {
		this.component = realFile;
	}
	
	// PRETTY PRINT
	
	public String prettyPrint() {
		return this.component.prettyPrint();
	}
	
	// GETTERS
	
	public String getName() {
		return this.component.getName();
	}

	public String getExtension() {
		return this.component.getExtension();
	}

	public String getSize() {
		return this.component.getSize();
	}

	public String getDateCreated() {
		return this.component.getDateCreated();
	}

	public String getDateModified() {
		return this.component.getDateModified();
	}

	public String getPermissions() {
		return this.component.getPermissions();
	}
}
