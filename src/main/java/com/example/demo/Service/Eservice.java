package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Entity;
import com.example.demo.Repo.Repository;


@Service
public class Eservice {
    
    @Autowired
    Repository repo;


    public Entity sEntity(Entity entity){
        return repo.save(entity);

    }

    public List<Entity> sEntitys(List<Entity> entity){
        return repo.saveAll(entity);
        
    }

    public List<Entity> getEntity(){
        return repo.findAll();
    }

    public String delete(int id){
        repo.deleteById(id);
        return id + "has been deleted";
    }

    public Entity upEntity(Entity entity){
        Entity exEntity = repo.findById(entity.getId()).orElse(null);
        exEntity.setId(entity.getId());
        exEntity.setFname(entity.getFname());
        exEntity.setSname(entity.getSname());
        return repo.save(exEntity);

    }
    
    
}
