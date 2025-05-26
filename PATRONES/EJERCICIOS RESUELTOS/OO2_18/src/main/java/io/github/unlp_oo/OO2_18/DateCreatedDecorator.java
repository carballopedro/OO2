package io.github.unlp_oo.OO2_18;

public class DateCreatedDecorator extends FileDecorator {

	public DateCreatedDecorator(IFileOO2 component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.getDateCreated();
	}
}
