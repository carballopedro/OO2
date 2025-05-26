package io.github.unlp_oo.OO2_18;

public class DateModifiedDecorator extends FileDecorator {

	public DateModifiedDecorator(IFileOO2 component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.getDateModified();
	}

}
