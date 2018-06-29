package com.service.provider.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-26T08:35:29.832Z")

@RestSchema(schemaId = "provider")
@RequestMapping(path = "/provider", produces = MediaType.APPLICATION_JSON)
public class ProviderImpl {

    @Autowired
    private ProviderDelegate userProviderDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProviderDelegate.helloworld(name);
    }

}
