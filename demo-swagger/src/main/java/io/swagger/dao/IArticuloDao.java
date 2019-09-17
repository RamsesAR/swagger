package io.swagger.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import io.swagger.model.Articulo;


/*
public interface IArticuloDao extends CrudRepository<Articulo, String> {

}*/

public interface IArticuloDao{
	
	public Articulo findByID(String id);
	public void save(Articulo art);
	
}


