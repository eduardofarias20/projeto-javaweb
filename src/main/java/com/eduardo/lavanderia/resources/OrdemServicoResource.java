package com.eduardo.lavanderia.resources;

import com.eduardo.lavanderia.models.OrdemServico;
import com.eduardo.lavanderia.service.AbstractService;
import com.eduardo.lavanderia.service.OrdemServicoService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/ordens")
public class OrdemServicoResource extends AbstractResource<OrdemServico> {

    @Inject
    private OrdemServicoService service;

    @Override
    protected AbstractService<OrdemServico> getService() {
        return service;
    }

}