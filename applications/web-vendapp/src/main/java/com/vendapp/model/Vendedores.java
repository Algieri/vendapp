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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * Entity de la tabla Vendedores
 */
@Entity
@Table(name="vendedores")
public class Vendedores {

	@Id
	
	@Column(name = "id_vendedor")
	private Integer idVendedor;
	
	@Column(name = "nombre_vendedor")
	private String nombreVendedor;
	
	@Column(name = "id_ruta")
	private Integer idRuta;

	//Relaciones entre tablas
	
	@OneToMany(fetch=FetchType.EAGER)
    @JoinTable(name="pedido",joinColumns=
    @JoinColumn(name="id_vendedor", referencedColumnName="id_vendedor")
    )
	public List<Pedidos> pedidolist;
	
	@OneToMany(fetch=FetchType.EAGER)
    @JoinTable(name="facturas",joinColumns=
    @JoinColumn(name="id_vendedor", referencedColumnName="id_vendedor")
    )
	public List<Facturas> facturalist;
	//Método GET y SET
	
	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	public Integer getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(Integer idRuta) {
		this.idRuta = idRuta;
	}
	
}