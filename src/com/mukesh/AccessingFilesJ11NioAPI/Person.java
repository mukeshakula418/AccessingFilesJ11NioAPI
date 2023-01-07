package com.mukesh.AccessingFilesJ11NioAPI;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(){
    }

    public Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge() {
        this.age = age;
    }
    public String getCity() {
        return city;
    }
    public void setCity() {
        this.city = city;
    }
    public String toString() {
        return "Person [name="+ name + ", age =" + age +", city" + city + "]";
    }
}
