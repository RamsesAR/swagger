package io.swagger.api;

import io.swagger.model.Articulo;
import io.swagger.service.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-17T20:30:04.433Z")

@Controller
public class ArticuloApiController implements ArticuloApi {

    private static final Logger log = LoggerFactory.getLogger(ArticuloApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ArticuloApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    @GetMapping("/{articuloId}")
    public ResponseEntity<Articulo> getArticuloById(@ApiParam(value = "ID del articulo a regresar",required=true) @PathVariable("articuloId") String articuloId) {
        String accept = request.getHeader("Accept");
        
        
        CatalogoArticulos articulos = new CatalogoArticulos();
        
        Articulo item;
        
        if (accept != null && accept.contains("application/xml")) {
            try {
                //
            	item = articulos.findByID(articuloId);
            	System.out.println(item);
            	if(item == null) {
            		return new ResponseEntity<Articulo>(objectMapper.readValue("<Articulo>  <id>aeiou</id>  <nombre>Nombre Producto</nombre>  <descripcion>Descripcion Producto</descripcion>  <precio>3.149</precio>  <modelo>Modelo</modelo></Articulo>", Articulo.class), HttpStatus.NOT_IMPLEMENTED);
            	}else
            	{
            		return new ResponseEntity<Articulo>(objectMapper.readValue("<Articulo>  <id>" + item.getId() + " </id>  <nombre>" + item.getNombre() + " </nombre>  <descripcion>" + item.getDescripcion() + " </descripcion>  <precio>" + item.getPrecio() + " </precio>  <modelo>" + item.getModelo() + " </modelo></Articulo>", Articulo.class), HttpStatus.NOT_IMPLEMENTED);	
            	}
            	
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Articulo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
            	item = articulos.findByID(articuloId);
            	if(item == null) {
            		return new ResponseEntity<Articulo>(objectMapper.readValue("{  \"descripcion\" : \"Descripcion Producto\",  \"precio\" : 0.8008281904610115,  \"id\" : \"id\",  \"nombre\" : \"Nombre Producto\",  \"modelo\" : \"Modelo\"}", Articulo.class), HttpStatus.NOT_IMPLEMENTED);
            	}else
            	{
            		return new ResponseEntity<Articulo>(objectMapper.readValue("{  \"descripcion\" : \"" + item.getDescripcion() + "\",  \"precio\" : " + item.getPrecio() +  "\"id\" : \"" + item.getId() + "\",  \"nombre\" : \"" + item.getNombre() + "\",  \"modelo\" : \"" + item.getModelo() +"\"}", Articulo.class), HttpStatus.NOT_IMPLEMENTED);
            	}
            	
         
                
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Articulo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Articulo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateArticuloWithForm(@ApiParam(value = "ID para articulo se necesita",required=true) @PathVariable("articuloId") String articuloId,@ApiParam(value = "Actualiza la descripcion del articulo") @RequestParam(value="descripcion", required=false)  String descripcion,@ApiParam(value = "Actualiza el modelo del articulo") @RequestParam(value="modelo", required=false)  String modelo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
