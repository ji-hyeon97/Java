package com.company;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Gender type = Gender.FEMALE;
        performer human = new performer("seo",40,1.91f,"남산", "액션",type.FEMALE);
        //Human human2 = new Human("jon",40);
        human.setName("SEO");
        human.setAge(40);
        human.setHeight(1.91f);
        System.out.println("name: " + human.getName());
        System.out.println("age: " + human.getAge());
        System.out.println("height: " + human.getHeight());
        System.out.println("musicSchool: " + human.getMusicSchool());
        System.out.println("genre: " + human.getGenre());
        human.compute();
        System.out.println(Gender.FEMALE.comment());
        System.out.println(Gender.UNDEFINED.comment());
    }
}
