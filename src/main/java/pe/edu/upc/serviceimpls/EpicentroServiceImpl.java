package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.CEpicentroDao;
import pe.edu.upc.entities.Epicentro;
import pe.edu.upc.serviceinterfaces.CEpicentroService;

@Named
public class EpicentroServiceImpl implements CEpicentroService{
	@Inject
	private CEpicentroDao epDao;

	
	public void insert(Epicentro ep) {
		// TODO Auto-generated method stub
		epDao.insert(ep);
	}

	
	public List<Epicentro> list() {
		// TODO Auto-generated method stub
		return epDao.list();
	}


	public void delete(int id) {
		// TODO Auto-generated method stub
		epDao.delete(id);
	}
}
