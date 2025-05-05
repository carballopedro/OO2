package io.github.unlp_oo.OO2_4;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends ToDoItemState {
	
	public void togglePause(ToDoItem item) {
		item.setStatus(new Paused());
	}
	
	public Duration workedTime(ToDoItem item) {
		return Duration.between(item.getStartDate(), LocalDateTime.now());
	}
	
	public void finish(ToDoItem item) {
		item.setStatus(new Finished());
		item.setEndDate();
	}
	
	public void addComment (String comment, ToDoItem item) {
		item.agregarComentario(comment);
	}

	
}
