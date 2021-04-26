package com.generics;
import com.company.Gender;
import com.company.Musician;
import com.company.performer;

public class GenericsDemo {
    public static void main(String[] args) {
        performer john = new performer("John", 40, 1.91f, "남산", "영화", Gender.MALE);
        performer jane = new performer("Jane", 34, 1.591f, "남산", "영화", Gender.FEMALE);
        Pair<performer, performer> performerPair = Pair.of(john, jane);
        System.out.println(performerPair.toString());
        Pair<String, String> StringPair = Pair.of("X-String", "Y-String");
        System.out.println(StringPair);
        Pair<String, performer> spPair = Pair.of("John", john);
        System.out.println(spPair);
        System.out.println("all good.");
    }
}

