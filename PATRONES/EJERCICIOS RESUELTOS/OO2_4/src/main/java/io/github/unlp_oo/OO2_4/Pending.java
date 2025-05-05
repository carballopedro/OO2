package io.github.unlp_oo.OO2_4;

import java.time.Duration;

public class Pending extends ToDoItemState  {
	
	public void start(ToDoItem item) {
		item.setStatus(new InProgress());
		item.setStartDate();
	}
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public Duration workedTime(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en finished, pause o in-progress");
	}
	
	public void addComment (String comment, ToDoItem item) {
		item.agregarComentario(comment);
	}

}
