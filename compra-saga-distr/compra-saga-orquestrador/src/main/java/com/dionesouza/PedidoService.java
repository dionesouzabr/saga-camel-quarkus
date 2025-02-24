package com.dionesouza;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.apache.camel.Header;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(baseUri = "http://pedido-dione-souza25-dev.apps.rm2.thpm.p1.openshiftapps.com/pedido")
public interface PedidoService {

    @GET
    @Path("newPedido")
    @Produces(MediaType.TEXT_PLAIN)
    public void newPedido(@QueryParam("id") @Header("id") Long id);

    @GET
    @Path("cancelPedido")
    @Produces(MediaType.TEXT_PLAIN)
    public void cancelPedido(@QueryParam("id") @Header("id") Long id);
}
