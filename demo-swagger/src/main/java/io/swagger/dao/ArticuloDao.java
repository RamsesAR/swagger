package io.swagger.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.swagger.model.Articulo;

@Repository
public class ArticuloDao implements IArticuloDao{

	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Articulo findByID(String id) {
		// TODO Auto-generated method stub
		System.out.println("entra dao");
		List<Articulo> articulos = em.createQuery("from Articulo where id = " + id).getResultList();
		System.out.println("entra dao2");
		if(articulos.isEmpty()){
			System.out.println("entra dao3");
			return new Articulo();
		}else {
			System.out.println("entra dao4");
			return articulos.iterator().next();
		}
		 
	}

	@Override
	public void save(Articulo art) {
		Articulo art2 = this.findByID(art.getId());

		art2.setDescripcion(art.getDescripcion());
		art2.setModelo(art.getModelo());
		
		
		em.persist(art2);
	}

}
