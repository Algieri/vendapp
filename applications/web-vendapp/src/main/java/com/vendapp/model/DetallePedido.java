package com.vendapp.model; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Entity de la tabla Detalle de Pedidos
 */

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {

	@Id
	
	@Column(name = "id_pedido")
	private Integer idPedido;
	
	@Column(name = "id_producto")
	private Integer idProducto;
	
	@Column(name = "cantidad")
	private Integer Cantidad;

	//Método GET y SET
	
	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
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
