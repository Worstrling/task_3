package com.company;

public class Main {
    public static void main(String[] args) {
        MyStack list = new MyStack();
        list.add("?!");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("ввв");
        list.add("5");
        list.revers();
        list.display();
    }
}
