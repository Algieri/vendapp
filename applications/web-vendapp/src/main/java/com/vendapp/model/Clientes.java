package com.vendapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity de la tabla Clientes
 */
@Entity
@Table(name = "clientes")
public class Clientes {
	
	@Id    //Llave Primaria
	
	@Column(name = "id_cliente")
	private Integer idCliente;
	
	@Column(name = "nombre_cliente")
	private String nombreCliente;
	
	@Column(name = "direccion")
	private String direccion;
	
	//Relaciones entre tablas
	
	@OneToOne(optional=false)
    @JoinTable(name="rutacliente",joinColumns=
    @JoinColumn(name="id_cliente", referencedColumnName="id_cliente")
      )
    public List<RutaCliente> rutaclientelist;
	
	@OneToMany(fetch=FetchType.EAGER)
    @JoinTable(name="pedido",joinColumns=
    @JoinColumn(name="id_cliente", referencedColumnName="id_cliente")
    )
	public List<Pedidos> pedidolist;
	
	@OneToMany(fetch=FetchType.EAGER)
    @JoinTable(name="facturas",joinColumns=
    @JoinColumn(name="id_cliente", referencedColumnName="id_cliente")
    )
	public List<Facturas> facturalist; 
	
	//Método GET y SET
	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	

}
