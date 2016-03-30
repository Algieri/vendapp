package com.vendapp.repositories;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.DetallePedido;

@RepositoryRestResource(collectionResourceRel = "detalle_pedido", path = "detalle_pedido", exported = false)
public interface DetallePedidoRepository extends BaseRepository<DetallePedido, Integer> {

}