package com.eduardo.lavanderia.resources;

import com.eduardo.lavanderia.models.Cliente;
import com.eduardo.lavanderia.service.AbstractService;
import com.eduardo.lavanderia.service.ClienteService;


import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/clientes")
public class ClienteResource extends AbstractResource<Cliente> {

    @Inject
    private ClienteService service;

    @Override
    protected AbstractService<Cliente> getService() {
        return service;
    }

}