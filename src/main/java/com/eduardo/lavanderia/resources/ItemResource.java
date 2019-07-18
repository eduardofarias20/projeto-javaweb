package com.eduardo.lavanderia.resources;

import com.eduardo.lavanderia.models.Item;
import com.eduardo.lavanderia.service.AbstractService;
import com.eduardo.lavanderia.service.ItemService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/itens")
public class ItemResource extends AbstractResource<Item> {

    @Inject
    private ItemService service;

    @Override
    protected AbstractService<Item> getService() {
        return service;
    }

}