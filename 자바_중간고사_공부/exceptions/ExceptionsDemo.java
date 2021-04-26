package com.exceptions;
import com.company.performer;

public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            performer p = PerformerGenerator.get("John");
            System.out.println("TTL: " + p.getTimeToLive());
        } catch (Exception e) {
            System.out.println("Cannot use performer!");
        } finally {
            System.out.println("all went expected");
        }
    }
}
