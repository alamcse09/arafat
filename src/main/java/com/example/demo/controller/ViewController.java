package com.example.demo.controller;

import com.example.demo.model.Data;
import com.example.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    private DataService dataService;

    @RequestMapping( "/view" )
    public String show( Model model ){

        List<Data> dataList = dataService.findAll();

        model.addAttribute( "dataList", dataList );

        return "table";
    }
}
