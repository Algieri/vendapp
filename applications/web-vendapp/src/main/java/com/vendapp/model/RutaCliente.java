package com.vendapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Entity de la tabla Ruta Cliente
 */
@Entity
@Table(name="rutacliente")
public class RutaCliente {

	@Id
	
	@Column(name = "id_cliente")
	private Integer idCliente;
	
	@Column(name = "id_ruta")
	private Integer idRuta;
		
	//Método GET y SET
	
	public Integer getidRuta() {
		return idRuta;
	}

	public void setIdRuta(Integer idRuta) {
		this.idRuta =idRuta;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdClienten(Integer idCliente) {
		this.idCliente = idCliente;

	}
	
}