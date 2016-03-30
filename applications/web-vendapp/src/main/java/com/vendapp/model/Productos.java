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
import javax.persistence.Table;


/**
 * Entity de la tabla Producto
 */
@Entity
@Table(name="productos")
public class Productos {

	@Id
	
	@Column(name = "id_producto")
	private Integer idProducto;
	
	@Column(name = "nombre_producto")
	private String nombreProducto;
	
	@Column(name = "precio")
	private float Precio;
	
	@Column(name = "cantidad")
	private Integer Cantidad;
	
	//Relaciones entre tablas
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinTable(name="detalle_factura",joinColumns=
    @JoinColumn(name="id_factura", referencedColumnName="id_factura")
    )
	public  List<DetalleFactura> detallefacturalist;
	
	//Método GET y SET
	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float Precio ) {
		this.Precio = Precio;
	}
	

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer Cantidad ) {
		this.Cantidad = Cantidad;
	}
		
}
