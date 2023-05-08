package com.example.demo.Entity;

import jakarta.persistence.Id;
import lombok.Data;

@jakarta.persistence.Entity
@Data
public class Entity {
    @Id
    private int id;
    private String Fname;
    private String Sname;

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getSname() {
        return Sname;
    }
  
    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public Entity(int id, String fname, String sname) {
        this.id = id;
        Fname = fname;
        Sname = sname;
    }

    

}
