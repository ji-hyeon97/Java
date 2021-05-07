package com.homework;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
public class Library {
    private List<Book> books = new ArrayList<>(){
        {
            add(new Book("java", "서지현", 10, "computer", true));
        }};
    Scanner user = new Scanner(System.in);
    public void login(){
        Person p = null;
        while(true){
            System.out.println("--------------서지현(Library management program assignment)----------------------");
            System.out.println("Please type : A. Login the program Q. Log out the program");
            String n = user.next();
            switch(n) {
                case "A":
                    System.out.println("Please type in your id:");
                    String id = user.next();
                    System.out.println("Please type in password:");
                    String password = user.next();
                    MessageDigest md = null;
                    try {
                        md = MessageDigest.getInstance("SHA-256");
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                    }
                    md.update(password.getBytes());
                    String hex = String.format("%064x", new BigInteger(1, md.digest()));
                    p = new User(id, password);
                    System.out.println("login successful!");
                    System.out.println("user-> " + "id:" + p.getId() + " and " + "encryption password: " + hex);
                    while (true) {
                        System.out.println("Please type in your operation: 1. Add books 2. Lend books 3. Return books 4. Display the book list 5. Exit");
                        int i = user.nextInt();
                        if (i == 5) {
                            System.out.println("You have successfully logged out!");
                            break;
                        } else {
                            p.operate(books, i);
                        }
                    }
                    break;
                case "Q":
                    return;
            }
        }
    }
}