package io.github.unlp_oo.OO2_18;

public class SizeDecorator extends FileDecorator {

	public SizeDecorator(IFileOO2 component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.getSize() + "MB";
	}
}
