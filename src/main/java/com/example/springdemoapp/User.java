package com.example.springdemoapp;

import com.example.springdemoapp.model.Kris;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value = "prototype")   // krijon 2 objekte

public class User {

    private int age;
    private String name;
    @Qualifier("emp1") // specifikon punonjesin me vlere te caktiuar tek @Componenti
    @Autowired
    private Kris kris;


    public User() {
        this.age=2;
        this.name="Team System";
        System.out.println("This is a user");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void userTalking(){
        System.out.println("Hello user");
        kris.talk();
    }

    @Override
    public String toString() {
        return "User_Company{" +
                "age=" + age +"years on market"+
                ", name='" + name + '\n'+kris.toString();

    }
}
