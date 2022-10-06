package com.company;

public class MyStack {
    private LinkedListStack<String> list1 = new LinkedListStack<>();
    private LinkedListStack<String> list2 = new LinkedListStack<>();

    public void add(String value){
        list1.push(value);
    }

    public void revers(){
        if(getSize() == 0) {
            System.out.println("Empty");
        } else {
            int size = list1.getSize();
            for (int i = 0; i < size; i++){
                list2.push(list1.pop());

            }
        }

    }

    public int getSize(){
        return list1.getSize();
    }

    public void display() {
            for (int i = 0; i< list2.getSize(); i++){
                System.out.print(list2.get(i)+ " ");


            }
        }
    }
