package com.vendapp.model; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity de la tabla Detalle de Facturas
 */
@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {
	@Id

	@Column(name = "id_factura")
	private Integer idFactura;
	
	@Column(name = "id_producto")
	private Integer idProducto;
	
	@Column(name = "cantidad")
	private Integer Cantidad;

	//Método GET y SET
	
	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer Cantidad) {
		this.Cantidad = Cantidad;
		}

}