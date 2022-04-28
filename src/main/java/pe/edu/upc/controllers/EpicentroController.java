package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Epicentro;
import pe.edu.upc.serviceinterfaces.CEpicentroService;

@Named
@RequestScoped
public class EpicentroController {
	@Inject
	private CEpicentroService epService;
	
	private Epicentro ep;
	List<Epicentro> listaEpicentro;
	
	@PostConstruct
	public void init() {
		this.listaEpicentro=new ArrayList<Epicentro>();
		this.ep=new Epicentro();
		this.list();
	}
	
	public String newEpicentro() {
		this.setEP(new Epicentro());
		return "Epicentro.xhtml";
	}
	
	public void insert() {
		try {
			epService.insert(ep);
		}catch (Exception e){
			System.out.println("Error ocurridó en el controlador de persona al insertar!!");
		}
		
	}
	
	public void list() {
		// TODO Auto-generated method stub
		try {
			listaEpicentro = epService.list();
		} catch (Exception e) {
			System.out.println("Error al listar epicentros en el controller!! ");
		}
	}
	
	public void delete(Epicentro epn) {
		epService.delete(epn.getCodigoEpicentro());
		list();
	}
	
	public Epicentro getEP() {
		return ep;
	}

	public void setEP(Epicentro ep) {
		this.ep = ep;
	}
	
	public List<Epicentro> getListaEpicentro() {
		return listaEpicentro;
	}

	public void setListaEpicentro(List<Epicentro> listaEpicentro) {
		this.listaEpicentro = listaEpicentro;
	}
	
	
}
