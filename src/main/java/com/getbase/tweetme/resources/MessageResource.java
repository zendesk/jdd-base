package com.getbase.tweetme.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by pawel on 07/10/14.
 */
@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class MessageResource {

    public String getMessage() {
        return null;
    }

}