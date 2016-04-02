
package com.vendapp.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity de la tabla Ruta
 */

@Entity
@Table(name="ruta")
public class Rutas {

	@Id
	
	@Column(name = "id_ruta")
	private Integer idRuta;
	
	@Column(name = "descripcion")
	private String Descripcion;
	
	//Relaciones entre tablas
	
	@OneToMany(fetch=FetchType.EAGER)
    @JoinTable(name="rutacliente",joinColumns=
    @JoinColumn(name="id_ruta", referencedColumnName="id_ruta")
    )
  public List<RutaCliente> rutaclientelist;
	
	
	@OneToMany(fetch=FetchType.EAGER)
    @JoinTable(name="vendedores",joinColumns=
    @JoinColumn(name="id_ruta", referencedColumnName="id_ruta")
    )
  public List<Vendedores> vendedoreslist;
	
	
	//Método GET y SET
	
	public Integer getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(Integer idRuta) {
		this.idRuta =idRuta;
	}


	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
	
}