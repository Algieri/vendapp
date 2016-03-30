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

import com.vendapp.model.RutaCliente;

import com.vendapp.repositories.ProductosRepository;
import com.vendapp.repositories.RutaClienteRepository;
import com.vendapp.repositories.RutaRepository;
import com.vendapp.utils.AppUtils;

@RestController
public class RutaClienteWS {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RutaClienteRepository service;

	public RutaClienteRepository getService() {
		return service;
	}

	public void setService(RutaClienteRepository service) {
		this.service = service;
	}

	@RequestMapping(value = "/rutaclient", method = RequestMethod.GET, produces = { "application/json" })
	public List<RutaCliente> rutaclientelist() {
		try {
			return Lists.newArrayList(service.findAll());
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = { "application/json" })
	public RutaCliente findByPK(@RequestParam(name = "id") Integer id) {
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
	public RutaCliente findByID(@PathVariable Integer id) {
		try {
			logger.info("ID de busqueda recibido -> {}", id); 
			return service.findOne(id);
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}



}
