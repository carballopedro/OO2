package io.github.unlp_oo.OO2_12;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {

	private Directory directory;
	
	public FileSystem(Directory directory) {
		this.directory = directory;
	}

	// Retorna el espacio total ocupado, incluyendo todo su contenido
	public double getTotalSize() {
		return this.directory.getSize();
	}
	
	// Retorna el archivo con mayor cantidad de bytes en cualquier nivel del filesystem 
	public File getLargestFile() {
		return this.directory.getLargestFile();
	}
	  
	// Retorna el archivo con fecha de creación más reciente en cualquier nivel del filesystem
	public File getNewestFile() {
		return this.directory.getNewestFile();
	}
	
	// Retorna el primer elemento con el nombre solicitado contenido en cualquier nivel del filesystem
	public Component search(String name){
		  return this.directory.search(name);
	}
	
	// Retorna la lista con los elementos que coinciden con el nombre solicitado contenido en cualquier nivel del filesystem
	public List<Component> searchAll(String name){
		List<Component> list = new ArrayList<Component>();
		this.directory.searchAll(name, list);
		return list;
	}
	
	// Retorna un String con los nombres de los elementos contenidos en todos los 
	// niveles del filesystem. De cada elemento debe retornar el path completo
	// (similar al comando pwd de linux) siguiendo el modelo presentado a continuación
	// /Directorio A
	// /Directorio A/Directorio A.1
	// /Directorio A/Directorio A.1/Directorio A.1.1
	// /Directorio A/Directorio A.1/Directorio A.1.2 	
	// /Directorio A/Directorio A.2
	// /Directorio B
	public String contentList() {
		return this.directory.contentList("/");
	}

}
