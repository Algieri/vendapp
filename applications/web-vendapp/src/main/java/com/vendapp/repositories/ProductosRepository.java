package com.vendapp.repositories;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.vendapp.model.Productos;

@RepositoryRestResource(collectionResourceRel = "productos", path = "productos", exported = false)
public interface ProductosRepository extends BaseRepository<Productos, Integer> {

}