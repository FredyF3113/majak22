package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table (name="Epicentro")
public class Epicentro {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int codigoEpicentro;
	
	@Column(name="Latitud", nullable=false, length=47)
	private String Latitud;
	
	@Column(name="Altitud", nullable=false, length=47)
	private String Altitud;
	
	@Column(name="RadioEpicentro", nullable=false, length=47)
	private String RadioEpicentro;

	public Epicentro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigoEpicentro() {
		return codigoEpicentro;
	}

	public void setCodigoEpicentro(int codigoEpicentro) {
		this.codigoEpicentro = codigoEpicentro;
	}

	public String getLatitud() {
		return Latitud;
	}

	public void setLatitud(String latitud) {
		Latitud = latitud;
	}

	public String getAltitud() {
		return Altitud;
	}

	public void setAltitud(String altitud) {
		Altitud = altitud;
	}

	public String getRadioEpicentro() {
		return RadioEpicentro;
	}

	public void setRadioEpicentro(String radioEpicentro) {
		RadioEpicentro = radioEpicentro;
	}
	
}
