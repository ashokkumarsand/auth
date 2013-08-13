/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Ashok
 */
@Path("login")
public class Login {
    @GET
    @Path("/")
    public String login() {
        return "login";
    }
    
    
}
