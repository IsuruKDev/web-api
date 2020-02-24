package com.synergen.techlabs.controller;

import com.synergen.techlabs.dtos.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {



    @GetMapping(path = "/")
    public Response appResponseMeth(){
        return new Response("web-api is running",200);
    }
}
