package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.CEpicentroDao;
import pe.edu.upc.entities.Epicentro;

public class EpicentroImpl implements CEpicentroDao {
	@PersistenceContext(unitName="majak")
	private EntityManager em;
	
	@Transactional
	public void insert(Epicentro ep) {
		// TODO Auto-generated method stub
		try {
			
			em.persist(ep);
		}catch(Exception e) {
			System.out.println("Error al insertar persona en DAO");
			
		}
	}

	@SuppressWarnings("unchecked")
	public List<Epicentro> list() {
		List<Epicentro> listaEpicentro = new ArrayList<Epicentro>();
		try {
			Query jpql = em.createQuery("from Epicentro ep");
			listaEpicentro = (List<Epicentro>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de persona");
		}
		return listaEpicentro;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Epicentro epn = em.find(Epicentro.class, id);

		em.remove(epn);
	}
	
}
