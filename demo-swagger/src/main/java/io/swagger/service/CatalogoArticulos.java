package io.swagger.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.swagger.dao.IArticuloDao;
import io.swagger.model.Articulo;

@Component
public class CatalogoArticulos implements ICatalogoArticulos{

	@Autowired
	private IArticuloDao em;

	@Transactional(readOnly = true)
	public Articulo findByID(String id) {
		System.out.println("entra");
		System.out.println(id);
		Articulo art = em.findByID(id);
		
		if(art== null) {
			System.out.println("nulo");
		}
		else
		{
			System.out.println("algo");
		}
		return new Articulo();
		
	}

	@Transactional()
	public void save(Articulo art) {
		
		em.save(art);
		
		
	}

}
