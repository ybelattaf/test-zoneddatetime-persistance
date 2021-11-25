package com.techinstinct;

import com.techinstinct.domain.Person;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/person")
public class PersonResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons() {
        return Person.listAll();
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newPerson(Person person) {
        person.persist();
        return Response.status(Response.Status.CREATED).entity(person).build();
    }


}