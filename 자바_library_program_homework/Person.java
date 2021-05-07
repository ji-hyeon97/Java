package com.homework;
import java.util.List;
public abstract class Person {
    private String id;
    private String password;
    Person(String id,String password) {
        this.password = password;
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public abstract void operate(List<Book> books, int i);
}
