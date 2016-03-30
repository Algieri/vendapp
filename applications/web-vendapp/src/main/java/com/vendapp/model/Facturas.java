package com.vendapp.model; 
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity de la tabla Facturas
 */
@Entity
@Table(name = "facturas")
public class Facturas {
	@Id
	
	@Column(name = "id_factura")
	private Integer idFactura;
	
	@Column(name = "fecha_factura")
	private Date fechaFactura;
	
	@Column(name = "id_vendedor")
	private Integer idVendedor;

	@Column(name = "id_cliente")
	private Integer idCliente;

	
	@Column(name = "importe")
	private String iImporte;
	

	//Relaciones entre tablas
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinTable(name="detalle_factura",joinColumns=
    @JoinColumn(name="id_factura", referencedColumnName="id_factura")
    )
	public  List<DetalleFactura> detallefacturalist;
	
	
	//Método GET y SET
	
	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
		}



	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
		}

	public String getImporte() {
		return iImporte;
	}

	public void setImporte(String Importe) {
		this.iImporte = Importe;
		}	
	
}