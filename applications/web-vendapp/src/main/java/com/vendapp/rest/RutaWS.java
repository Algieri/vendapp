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
import com.vendapp.model.Rutas;
import com.vendapp.repositories.ProductosRepository;
import com.vendapp.repositories.RutaRepository;
import com.vendapp.utils.AppUtils;

@RestController
public class RutaWS {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RutaRepository service;

	public RutaRepository getService() {
		return service;
	}

	public void setService(RutaRepository service) {
		this.service = service;
	}

	@RequestMapping(value = "/ruta", method = RequestMethod.GET, produces = { "application/json" })
	public List<Rutas> rutalist() {
		try {
			return Lists.newArrayList(service.findAll());
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = { "application/json" })
	public Rutas findByPK(@RequestParam(name = "id") Integer id) {
		try {
			logger.info("ID de busqueda recibido -> {}", id); 
			return service.findOne(id);
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}

	// Estilo REST
	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public Rutas findByID(@PathVariable Integer id) {
		try {
			logger.info("ID de busqueda recibido -> {}", id); 
			return service.findOne(id);
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}
}
