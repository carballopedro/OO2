package io.github.unlp_oo.OO2_15;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

	// x alguna razón tuve que hacer static mi variable de instancia y el método getComponent
	private static List<Component> components;
	
	public Catalogue() {
		components = new ArrayList<Component>();
	}
	
	public void addComponent(Component component) {
		components.add(component);
	}
	
	
	public static Component getComponent(String name) {
		return components.stream()
				.filter(elem -> elem.getName().equals(name))
				.findFirst()
				.orElse(null);
	}

}
