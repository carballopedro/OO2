package io.github.unlp_oo.OO2_12;

import java.time.LocalDate;
import java.util.List;

public class File extends Component {

	private double sizeInBytes;
	
	public File(String name, LocalDate date, double sizeInBytes) {
		super(name, date);
		this.sizeInBytes = sizeInBytes;
	}
	
	public double getSize() {
		return this.sizeInBytes;
	}
	
	public Component search(String name) {
		return this.compareName(name)? this : null;
	}
	
	public void searchChildren(String name, List<Component> list) {}
	
	// adds the file's name to the root, followed by a line break
	public String contentList(String prefix) {
		return prefix + this.getName() + "\n";
	}
	
	@Override
	public File getLargestFile() {
	    return this;
	}
	
	@Override
	public File getNewestFile() {
	    return this;
	}
	
}