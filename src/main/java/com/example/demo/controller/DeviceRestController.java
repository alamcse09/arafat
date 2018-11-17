package com.example.demo.controller;

import com.example.demo.model.Data;
import com.example.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DeviceRestController {

    @Autowired
    private DataService dataService;

    @RequestMapping( "/post/{data}")
    public Data postData(@PathVariable("data") Integer data ){

        return dataService.save( data );
    }

    @RequestMapping( "/get/{id}")
    public Optional<Data> getDate(@PathVariable( "id" ) Long id ){

        return dataService.findById( id );
    }
}
