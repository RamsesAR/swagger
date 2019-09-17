package io.swagger.service;

import io.swagger.model.Articulo;

public interface ICatalogoArticulos {
	public Articulo findByID(String id);
	public void save(Articulo art);

}
