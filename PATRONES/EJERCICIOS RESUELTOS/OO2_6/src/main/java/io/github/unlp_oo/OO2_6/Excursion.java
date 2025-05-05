package io.github.unlp_oo.OO2_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {

	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private String meetingPoint;
	private double cost;
	private int minCapacity;
	private int maxCapacity;
	private List<User> officialList;
	private List<User> waitingList;
	private EstadoInscripcion state;
	
	public Excursion (String name, LocalDate startDate, LocalDate endDate, String meetingPoint,
			double cost, int minCapacity, int maxCapacity) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.meetingPoint = meetingPoint;
		this.cost = cost;
		this.minCapacity = minCapacity;
		this.maxCapacity = maxCapacity;
		this.officialList = new ArrayList<User>();
		this.waitingList = new ArrayList<User>();
		this.state = new Provisoria();
	}
	
	public void setState(EstadoInscripcion state) {
		this.state = state;
	}
	
	public EstadoInscripcion getState() {
		return this.state;
	}
	
	public int getTotalParticipants() {
		return this.officialList.size();
	}
	
	public List<User> getOfficialList(){
		return this.officialList;
	}
	
	public List<User> getWaitingList(){
		return this.waitingList;
	}
	
	public int getWaitingListSize() {
		return this.waitingList.size();
	}
	
	public void inscribir (User user) {
		this.state.inscribir(this, user);
	}
	
	public String mainInfoToString() {
		return "Nombre: " + this.name + "\n"
				+ "Costo: " + this.cost + "\n"
				+ "Fecha de Inicio: " + this.startDate + "\n"
				+ "Fecha de Fin: " + this.endDate + "\n"
				+ "Punto de Encuentro: " + this.meetingPoint + "\n";
	}
	
	public String getInformation() {
		return this.mainInfoToString() + this.state.getInformation(this);
	}
	
	public String getEmailsInscriptos() {
	    return this.officialList.stream()
	            .map(inscripto -> inscripto.getEmail())
	            .collect(Collectors.joining("\n"));
	}
	
	
	public void addToWaitingList(User user) {
		this.waitingList.add(user);
	}
	
	public void addToOfficialList(User user) {
		this.officialList.add(user);
	}
	
	
	public int remainingToReachMin() {
		return this.minCapacity - this.getTotalParticipants();
	}
	
	public int remainingToReachMax() {
		return this.maxCapacity - this.getTotalParticipants();
	}
	
	public boolean reachedMinParticipants () {
		return this.remainingToReachMin() == 0;
	}
	
	public boolean reachedMaxParticipants () {
		return this.remainingToReachMax() == 0;
	}

}
