package io.github.unlp_oo.OO2_12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Directory extends Component {
	
	private List<Component> components;
	
	public Directory (String name, LocalDate date) {
		super(name, date);
		this.components = new ArrayList<Component>();
	}
	
	public void addComponent(Component c) {
		this.components.add(c);
	}

	// 32kb = pongo como si fueran 32 bytes
	public double getSize() {
		return 32 + this.components.stream().mapToDouble(c -> c.getSize()).sum();
	}
	
	public File getLargestFile() {
	    return this.components.stream()
	            .map(component -> component.getLargestFile())
	            .filter(Objects::nonNull)
	            .max(Comparator.comparingDouble(File::getSize))
	            .orElse(null);
	}
	
	public File getNewestFile() {
		return this.components.stream().map(elem -> elem.getNewestFile())
        		.max((file1, file2) -> file1.getDateCreated()
        		.compareTo(file2.getDateCreated())) 
                .orElse(null);
	}
	
	public Component search(String name) {
		return this.compareName(name)? this :
			this.components.stream()
            .map(component -> component.search(name))  		// Llamada recursiva a cada componente
            .filter(result -> result != null)  				// Filtra los resultados no nulos
            .findFirst()  									// Devuelve el primer resultado encontrado
            .orElse(null);  								// Si no hay coincidencias, devuelve null
	}
	
	public void searchChildren(String name, List<Component> list) {
		this.components.forEach(component -> component.searchAll(name, list));
	}
	
	public String contentList(String prefix) {
	    StringBuilder currentPath = new StringBuilder(prefix + this.getName() + "\n");

	    this.components.stream()
	        .map(child -> child.contentList(prefix + this.getName() + "/"))
	        .forEach(currentPath::append);

	    return currentPath.toString();
	}
}
