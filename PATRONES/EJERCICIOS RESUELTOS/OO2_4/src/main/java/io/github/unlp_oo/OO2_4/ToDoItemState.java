package io.github.unlp_oo.OO2_4;

import java.time.Duration;

public abstract class ToDoItemState {
	
	// no hacen nada salvo que los reescriban
	public void start(ToDoItem item) {}
	public void finish(ToDoItem item) {}
	public void addComment (String comment, ToDoItem item) {}
	
	
	public abstract void togglePause(ToDoItem item);
	public abstract Duration workedTime(ToDoItem item);
	
}
