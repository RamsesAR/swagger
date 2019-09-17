package io.swagger.model;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Articulo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-17T20:30:04.433Z")
@Entity
@Table(name = "articulos")
public class Articulo implements Serializable {
	@Id
	@Column(name="id", length = 10)
	@JsonProperty("id")
	private String id = null;

	@Column(length = 20)
	@JsonProperty("nombre")
	private String nombre = null;

	@Column(length = 200)
	@JsonProperty("descripcion")
	private String descripcion = null;

	
	@JsonProperty("precio")
	private Double precio = null;

	@Column(length = 10)
	@JsonProperty("modelo")
	private String modelo = null;

	public Articulo id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Articulo nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * Get nombre
	 * 
	 * @return nombre
	 **/
	@ApiModelProperty(example = "Nombre Producto", value = "")

	@Size(min = 0, max = 20)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Articulo descripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

	/**
	 * Get descripcion
	 * 
	 * @return descripcion
	 **/
	@ApiModelProperty(example = "Descripcion Producto", value = "")

	@Size(min = 0, max = 200)
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Articulo precio(Double precio) {
		this.precio = precio;
		return this;
	}

	/**
	 * Get precio
	 * 
	 * @return precio
	 **/
	@ApiModelProperty(value = "")

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Articulo modelo(String modelo) {
		this.modelo = modelo;
		return this;
	}

	/**
	 * Get modelo
	 * 
	 * @return modelo
	 **/
	@ApiModelProperty(example = "Modelo", value = "")

	@Size(min = 0, max = 10)
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Articulo articulo = (Articulo) o;
		return Objects.equals(this.id, articulo.id) && Objects.equals(this.nombre, articulo.nombre)
				&& Objects.equals(this.descripcion, articulo.descripcion)
				&& Objects.equals(this.precio, articulo.precio) && Objects.equals(this.modelo, articulo.modelo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, descripcion, precio, modelo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Articulo {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
		sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
		sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
		sb.append("    modelo: ").append(toIndentedString(modelo)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
