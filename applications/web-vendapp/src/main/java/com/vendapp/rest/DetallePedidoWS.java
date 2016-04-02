
package com.vendapp.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.vendapp.model.DetalleFactura;
import com.vendapp.model.DetallePedido;

import com.vendapp.repositories.DetalleFacturaRepository;
import com.vendapp.repositories.DetallePedidoRepository;
import com.vendapp.repositories.FacturasRepository;
import com.vendapp.utils.AppUtils;

@RestController
public class DetallePedidoWS {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DetallePedidoRepository service;

	public DetallePedidoRepository getService() {
		return service;
	}

	public void setService(DetallePedidoRepository service) {
		this.service = service;
	}

	@RequestMapping(value = "/detped", method = RequestMethod.GET, produces = { "application/json" })
	public List<DetallePedido> detallepedidolist() {
		try {
			return Lists.newArrayList(service.findAll());
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = { "application/json" })
	public DetallePedido findByPK(@RequestParam(name = "id") Integer id) {
		try {
			logger.info("ID de busqueda recibido -> {}", id); 
			return service.findOne(id);
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}

	// Me gusta mas asi, mas estilo REST
	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public DetallePedido findByID(@PathVariable Integer id) {
		try {
			logger.info("ID de busqueda recibido -> {}", id); 
			return service.findOne(id);
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}
}
