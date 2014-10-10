package com.getbase.tweetme.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by pawel on 07/10/14.
 */
@Path("/message")
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

    @GET
    public String getMessage() {
        return "Coding in modern Java stack with @getbaselab at #jdd_krakow Cc. @jdd_krakow";
    }

}