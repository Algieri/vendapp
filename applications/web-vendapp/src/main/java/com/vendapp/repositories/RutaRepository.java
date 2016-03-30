package com.vendapp.repositories;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.vendapp.model.Rutas;

@RepositoryRestResource(collectionResourceRel = "ruta", path = "ruta", exported = false)
public interface RutaRepository extends BaseRepository<Rutas, Integer> {

}