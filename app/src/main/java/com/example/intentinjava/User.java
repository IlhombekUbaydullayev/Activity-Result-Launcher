package com.example.intentinjava;


import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;
    User(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "id=" + id +
                " , name=" + name;
    }
}
