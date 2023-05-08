package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Entity;

public interface Repository extends JpaRepository<Entity,Integer> {
    
}
