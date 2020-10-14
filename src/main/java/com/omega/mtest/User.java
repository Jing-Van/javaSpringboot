package com.omega.mtest;

public class User {

    private int id;
    private String name;
    private int age;
    private String city;    

    public User(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age; 
        this.city = city;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    
}
