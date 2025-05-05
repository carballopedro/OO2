package io.github.unlp_oo.OO2_4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private ToDoItemState state;
	private List<String> comentarios;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		this.comentarios = new ArrayList<String>();
	}
	
	// setters
	public void setStatus(ToDoItemState state) {
		this.state = state;
	}
	
	public void setStartDate() {
		this.startDate = LocalDateTime.now();
	}
	
	public void setEndDate() {
		this.endDate = LocalDateTime.now();
	}
	
	// getters
	public LocalDateTime getStartDate() {
		return this.startDate;
	}
	
	public LocalDateTime getEndDate() {
		return this.endDate;
	}
	
	public ToDoItemState getState() {
		return this.state;
	}
	public List<String> getComments(){
		return this.comentarios;
	}
	
	
	public void start() {
		this.state.start(this);
	}
	
	public void togglePause() {
		this.state.togglePause(this);
	}
	
	public Duration workedTime() {
		return this.state.workedTime(this);
	}
	
	public void finish() {
		this.state.finish(this);
		
	}
	
	public void addComment (String comment) {
		this.state.addComment(comment, this);
	}
	
	public void agregarComentario(String comentario) {
		this.comentarios.add(comentario);
	}
}
