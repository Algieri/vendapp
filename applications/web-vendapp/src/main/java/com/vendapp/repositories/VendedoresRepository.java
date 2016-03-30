package com.vendapp.repositories;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.Vendedores;

@RepositoryRestResource(collectionResourceRel = "vendedores", path = "vendedores", exported = false)
public interface VendedoresRepository extends BaseRepository<Vendedores, Integer> {

}