package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//mi adapter

public class JSONSimpleAdapter implements Exporter {
	
	// crea un arreglo con de tipo JSONArray donde guarda todos los socios pero en forma de JSONObject
	// luego los convierte en String y los devuelve
	public String exportar(List<Socio> socios) {
		JSONArray arregloJSON = new JSONArray();
		socios.stream().forEach(s -> arregloJSON.add(this.crearSocio(s)));
		return arregloJSON.toJSONString();
	}
	
	// por cada socio, crea un objeto JSON con sus respectivos datos
	private JSONObject crearSocio(Socio socio) {
		JSONObject objetoJSON = new JSONObject();
		objetoJSON.put("nombre", socio.getNombre());
		objetoJSON.put("email", socio.getEmail());
		objetoJSON.put("legajo", socio.getLegajo());
		return objetoJSON;
	}

}
