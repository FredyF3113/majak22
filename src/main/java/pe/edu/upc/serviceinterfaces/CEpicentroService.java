package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Epicentro;

public interface CEpicentroService {
	public void insert (Epicentro ep);
	public List<Epicentro> list();
	public void delete (int id);
}
