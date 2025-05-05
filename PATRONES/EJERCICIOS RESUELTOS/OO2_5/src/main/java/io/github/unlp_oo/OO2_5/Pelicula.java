package io.github.unlp_oo.OO2_5;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	
	private String title;
	private int releaseYear;
	private double rating;
	private List<Pelicula> similares;
	
	public Pelicula (String title, int releaseYear, double rating)  {
		this.title = title;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.similares = new ArrayList<Pelicula>();
	}
	
	public void establecerSimilitud(Pelicula p) {
		if(!this.similares.contains(p)) {
			this.similares.add(p);
			p.similares.add(this);
		}
	}
	
	public int getReleaseYear() {
		return this.releaseYear;
	}
	
	public double getRating() {
		return this.rating;
	}
	
	public List<Pelicula> getSimilares(){
		return this.similares;
	}
}
