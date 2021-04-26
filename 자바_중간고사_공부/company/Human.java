package com.company;
abstract class Human {
    public static final int LIFESPAN = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void compute() {
        int ttl = LIFESPAN - this.age;
        System.out.println("time to live " + ttl);
    }

    private String name;
    private int age;
    private float height;
    private Gender gender;

    public Human(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name, int age, float height, Gender gender) {
        this(name, age, gender);
        this.height = height;
    }
}
