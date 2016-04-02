package com.vendapp.repositories;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.vendapp.model.Facturas;

@RepositoryRestResource(collectionResourceRel = "facturas", path = "facturas", exported = false)
public interface FacturasRepository extends BaseRepository<Facturas, Integer> {

}