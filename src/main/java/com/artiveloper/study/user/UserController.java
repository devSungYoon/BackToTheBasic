package com.artiveloper.study.user;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.io.IOException;

/**
 * Created by kimsunwoo on 2016-06-23.
 */
@Path("/users")
public class UserController {

    private final Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);

    @Path("/login")
    @GET
    public void login() {
        logger.debug("==============");
        System.out.println("get~~~~");
    }

    @Path("/login")
    @POST
    public void postLogin() {
        System.out.println("post~~~");
    }

}
