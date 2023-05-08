package com.example.demo.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Entity;
import com.example.demo.Service.Eservice;

@RestController
public class Control {

    @Autowired Eservice service;

    @GetMapping("/ename")
    public List<Entity> get(){
        List<Entity> enter = new ArrayList<>();
        enter.add(new Entity(1,"Venky","M"));
        enter.add(new Entity(2,"Naveen", "Nt"));
        return enter;
    }

    @PostMapping("/post")
    public Entity addEntity(Entity entry){
        return service.upEntity(entry);
    }

    @GetMapping("/get")
    public List<Entity> getEntity(){
        return service.getEntity();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
       return service.delete(id);
    }

}
