package com.bol.cd.fleet;

import com.bol.cd.fleet.model.*;

import javax.ws.rs.*;

@Path("/v1-alpha/")
public interface FleetApi {

    @GET
    @Path("/machines")
    public MachinePage getAllMachines(
            @QueryParam("nextPageToken") String nextPageToken
    );

    @GET
    @Path("/units")
    public UnitPage getAllUnits(
            @QueryParam("nextPageToken") String nextPageToken
    );

    @GET
    @Path("/units/{name}")
    public Unit getUnits(
            @PathParam("name") String name
    );

    @DELETE
    @Path("/units/{name}")
    public void getUnits(
            @PathParam("name") String name,
            DeletableUnit unit
    );

    @PUT
    @Path("units/{name}")
    public void putUnit(
            @PathParam("name") String name,
            DesiredUnitState unit

    );

}
