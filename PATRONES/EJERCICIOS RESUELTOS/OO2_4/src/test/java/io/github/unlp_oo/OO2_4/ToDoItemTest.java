package io.github.unlp_oo.OO2_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	private ToDoItem tareaInProgress;
	private ToDoItem tareaFinished;
	private ToDoItem tareaPaused;
	private ToDoItem tareaPending;
	
	@BeforeEach
	void setUp() {
		tareaInProgress = new ToDoItem("tarea1");
		tareaFinished = new ToDoItem("tarea2");
		tareaPaused = new ToDoItem("tarea3");
		tareaPending = new ToDoItem("tarea4");
		
		tareaInProgress.start();
		
		tareaFinished.start();
		tareaFinished.finish();
		
		tareaPaused.start();
		tareaPaused.togglePause();
	}
	
	@Test
	
	// TESTS START
	public void testStartInProgress() {
		this.tareaInProgress.start();
		assertTrue(this.tareaInProgress.getState() instanceof InProgress);
	}
	
	public void testStartFinished() {
		this.tareaFinished.start();
		assertTrue(this.tareaFinished.getState() instanceof Finished);
		
	}
	
	public void testStartPaused() {
		assertTrue(this.tareaPaused.getState() instanceof Paused);
		this.tareaPaused.start();
		assertTrue(this.tareaPaused.getState() instanceof InProgress);
	}
	
	public void testStartPending() {
		assertTrue(this.tareaPaused.getState() instanceof Pending);
		this.tareaPending.start();
		assertTrue(this.tareaPaused.getState() instanceof InProgress);
	}
	
	// TESTS FINISH
	public void testFinishtInProgress() {
		assertTrue(this.tareaInProgress.getState() instanceof InProgress);
		this.tareaInProgress.finish();
		assertTrue(this.tareaInProgress.getState() instanceof Finished);
	}
	
	public void testFinishFinished() {
		this.tareaFinished.finish();
		assertTrue(this.tareaFinished.getState() instanceof Finished);
		
	}
	
	public void testFinishPaused() {
		assertTrue(this.tareaPaused.getState() instanceof Paused);
		this.tareaPaused.finish();
		assertTrue(this.tareaFinished.getState() instanceof Finished);
	}
	
	public void testFinishPending() {
		this.tareaPending.finish();
		assertTrue(this.tareaPaused.getState() instanceof Pending);
	}
	
	// TESTS ADD COMMENT
	public void testAddCommenttInProgress() {
        assertEquals(0, tareaInProgress.getComments().size());
		this.tareaInProgress.addComment("comentario");
        assertEquals(1, tareaInProgress.getComments().size());
	}
	
	public void testAddCommentFinished() {
		this.tareaFinished.addComment("comentario");
		assertEquals(0, tareaInProgress.getComments().size());		
	}
	
	public void testAddCommentPaused() {
		assertEquals(0, tareaPaused.getComments().size());		
		this.tareaPaused.addComment("comentario");
		assertEquals(1, tareaPaused.getComments().size());	}
	
	public void testAddCommentPending() {
        assertEquals(0, tareaPending.getComments().size());
		this.tareaPending.addComment("comentario");
        assertEquals(1, tareaPending.getComments().size());
	}
	
	// TESTS WORKED TIME	
	public void testWorkedTimePending() {
        assertThrows(RuntimeException.class, () -> tareaPending.workedTime());
	}
	
	// TESTS TOGGLE PAUSE
	public void testToggelPausetInProgress() {
		assertTrue(this.tareaInProgress.getState() instanceof InProgress);
		tareaInProgress.togglePause();
		assertTrue(this.tareaInProgress.getState() instanceof Paused);

	}
	
	public void testToggelPauseFinished() {
        assertThrows(RuntimeException.class, () -> tareaFinished.togglePause());
	
	}
	
	public void testToggelPausePaused() {
		assertTrue(this.tareaPaused.getState() instanceof Paused);
		tareaPaused.togglePause();
		assertTrue(this.tareaPaused.getState() instanceof InProgress);
	}
	
	public void testToggelPausePending() {
        assertThrows(RuntimeException.class, () -> tareaPending.togglePause());

	}
}
