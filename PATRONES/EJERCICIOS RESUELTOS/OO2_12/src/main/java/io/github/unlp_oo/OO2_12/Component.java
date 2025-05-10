package io.github.unlp_oo.OO2_12;

import java.time.LocalDate;
import java.util.List;

public abstract class Component {

	private String name;
	private LocalDate dateCreated;
	
	// le paso la fecha en vez de LocalDate.now() para poder testear
	public Component (String name, LocalDate date) {
		this.name = name;
		this.dateCreated = date;
	}
	
	public abstract double getSize();
	
	public LocalDate getDateCreated() {
		return this.dateCreated;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean compareName(String name) {
		return this.name.equals(name);
	}
	
	public abstract Component search(String name);
	
	public abstract void searchChildren(String name, List<Component> list);

	// all components compare their name to the parameter
	// only directories implement searchChildren
	public void searchAll(String name, List<Component> list) {
		if (this.compareName(name)) {
			list.add(this);
		}
		this.searchChildren(name, list);
	}

	public abstract String contentList(String prefix);
	
	public abstract File getLargestFile();
	public abstract File getNewestFile();
}
