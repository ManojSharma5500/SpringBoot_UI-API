package com.example.apis;

import com.example.APIentity.Datalist;
import com.example.APIservice.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private DataService dataServices;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/data")
    public List<Datalist> getDatalist(){
        return this.dataServices.getDatalist();
    }
}