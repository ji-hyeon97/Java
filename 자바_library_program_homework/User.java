package com.homework;
import java.util.List;
import java.util.Scanner;
public class User extends Person implements operate {
    User(String id,String password){
        super(id,password);
    }
    Scanner user =  new Scanner(System.in);
    public void operate(List<Book> books, int i) {
        switch(i){
            case 1:
                add(books);
                break;
            case 2:
                lend(books);
                break;
            case 3:
                return_book(books);
                break;
            case 4:
                list(books);
                break;
            default:
                System.out.println("The input is wrong!");
        }
    }
    public void add(List<Book> books) {
        System.out.println("Please type in the title of the book:");
        String name = user.next();
        System.out.println("Please type in the Author:");
        String author = user.next();
        System.out.println("Please type in the price:");
        double price = user.nextDouble();
        System.out.println("Please type in a category:");
        String category = user.next();
        books.add(new Book(name,author,price,category,true));
    }
    public void lend(List<Book> books) {
        System.out.println("Please type in the name of the book you want to borrow:");
        String name = user.next();
        if (name != null) {
            books.forEach(book-> {
                if (book.getName().equals(name)) {
                    if(book.getState()){
                        book.setState(false);
                        System.out.println("Successful borrowing!");
                    } else{
                        System.out.println("Already borrowed!");
                    }
                }
            });
        }
    }
    public void return_book(List<Book> books) {
        System.out.println("Please type in the title of the book to be returned:");
        String name = user.next();
        if (name != null) {
            for (Book book : books) {
                if (book.getName().equals(name) && !book.getState()) {
                    book.setState(true);
                    System.out.println("Successfully returned the book!");
                    return;
                }
            }
            System.out.println("Return the book wrong!");
        }
    }
    public void list(List<Book> books) {
        System.out.println("The book list is as follows:");
        for (Book book : books) {
            System.out.println("Book Title: "+book.getName()+", Author: "+book.getAuthor()+ ", Price: "+book.getPrice()+", Classification: "+book.getCategory()+", Status: "+book.getState());
        }
    }
}