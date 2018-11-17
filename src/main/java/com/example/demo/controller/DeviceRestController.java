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

    @RequestMapping( "")
    public String instruction(){

        return "Go to https://arafatproject.herokuapp.com/post/1  to post a new data. Value written after 'post/' will be saved." +
                " you will get a id in response. To see a data, go to https://arafatproject.herokuapp.com/get/{id} and give the id at last";
    }
}
