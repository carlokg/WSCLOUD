package demo.modelo.entidad;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Avion {

	private int id;
	private String marca;
	@Autowired
	private ArrayList<Motor> motores;
	private int km;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public ArrayList<Motor> getMotores() {
		return motores;
	}
	public void setMotores(ArrayList<Motor> motores) {
		this.motores = motores;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return "Avion [id=" + id + ", marca=" + marca + ", motores=" + motores + ", km=" + km + "]";
	}
	
	
	
	
	
}
