package com.vendapp.repositories;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.DetalleFactura;

@RepositoryRestResource(collectionResourceRel = "detalle_factura", path = "detalle_factura", exported = false)
public interface DetalleFacturaRepository extends BaseRepository<DetalleFactura, Integer> {

}