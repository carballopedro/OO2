package io.github.unlp_oo.OO2_4;

import java.time.Duration;
import java.time.LocalDateTime;

public class Finished extends ToDoItemState  {
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public Duration workedTime(ToDoItem item) {
		return Duration.between(item.getStartDate(), LocalDateTime.now());
	}

}
