package com.example.springdemoapp.model;


import org.springframework.stereotype.Component;


@Component("emp1")
public class Kris {
    private String job;
    private  int age;


    public Kris() {
        this.job="Training on Job";
        this.age=21;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void talk(){
        System.out.println("I am talking with Kris");
    }

    @Override
    public String toString() {
        return "Kris{" +
                "job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}
