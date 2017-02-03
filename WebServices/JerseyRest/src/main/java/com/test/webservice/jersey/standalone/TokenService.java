package com.test.webservice.jersey.standalone;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jrout on 12/7/2016.
 */
@Path("/tokenservice")
public class TokenService {
    @POST
    @Path("/token")
    @Produces(MediaType.APPLICATION_XML)
    public Response generateToken(String tokenName , @HeaderParam("authorization") String authString) {
        System.out.println("Value = " + tokenName + " Auth : " + authString);

        Token token = new Token();
        token.setTokenValue(tokenName);
        token.setTokenName("Basic");
        return Response.ok(token).build();
    }
}

@XmlRootElement(name = "Token")
class Token {
    String tokenName;
    String tokenValue;

    public String getTokenName() {
        return tokenName;
    }
    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }
    public String getTokenValue() {
        return tokenValue;
    }
    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }
}
