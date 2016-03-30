package com.vendapp.repositories;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.vendapp.model.Pedidos;

@RepositoryRestResource(collectionResourceRel = "pedido", path = "pedido", exported = false)
public interface PedidoRepository extends BaseRepository<Pedidos, Integer> {

}