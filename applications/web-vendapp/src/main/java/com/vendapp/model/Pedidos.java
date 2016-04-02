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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.vendapp.utils.AppUtils;
/**
 * Entity de la tabla Pedido
 */
@Entity
@Table(name = "pedido")
public class Pedidos {
	@Id
	
	@Column(name = "id_pedido")
	private String idPedido;
	
	@Column(name = "id_cliente")
	private String idCliente;
	
	@Column(name = "fecha")
	private String fecha;
	
	//Relaciones entre tablas
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinTable(name="detalle_pedido",joinColumns=
    @JoinColumn(name="id_pedido", referencedColumnName="id_pedido")
    )
	public  List<DetallePedido> detallepedidolist;
	
	
	//Método GET y SET
	
	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}