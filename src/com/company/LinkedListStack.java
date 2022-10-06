package com.company;

public class LinkedListStack<string> {

    private class LinkedListStackNode {
        public String value;
        public LinkedListStackNode next;

        public LinkedListStackNode(String value, LinkedListStackNode next) {
            this.value = value;
            this.next = next;
        }

        public LinkedListStackNode(String value) {
            this.value = value;
            this.next = null;
        }
    }

    private LinkedListStackNode head = null;
    private LinkedListStackNode tail = null;
    private int size;

    public int getSize() {
        return size;
    }

    public String get(int index){
        if (size == 0) {
            return "size = 0";
        } else {
            return getNode(index).value;
        }
    }

    public void push(String value) {
        if(size == 0) {
            head = new LinkedListStackNode(value, head);
            tail = head;
        } else {
            tail.next = new LinkedListStackNode(value);
            tail = tail.next;
        }
        size++;
    }

    public String pop() {
        String curr = tail.value;
        if (size == 0) {
            System.out.println("Empty");
        } else {
            tail = getNode(size - 2);
            tail.next = null;
            size--;
        }
        return curr;
    }

    private LinkedListStackNode getNode(int index) {
        LinkedListStackNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public boolean isEmpty() {
        boolean isEmpty;
        if(size == 0) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }
        return isEmpty;
    }
}