package com.sberr.LList;

import java.util.Scanner;

public class Llist {
    private Node root;


    public void add(Object obj) {
        if(obj == null)
            return;
        Node node = new Node(obj);
        Node last = findLast();

        if(last == null){
            root=node;
        } else {
            last.next = node;
        }
    }

    public int size() {
        if(root == null)
            return 0;

        int count = 1;
        Node currentNode = root;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            count++;
        }
        return count;
    }

    public Object get(int id){
        Node result = root;
        if (0>=id || id> size()) {
            return "Пустотааа";
        }
        for (int i = 0; i < id-1; i++) {
            result = result.next;
        }

        return result.data;
    }

    private Node findLast() {
        if(root == null)
            return null;
        else{
            Node currentNode = root;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            return currentNode;
        }
    }
}

class Node {
    Object data;
    Node next;

    public Node(Object item){
        this.data = item;
    }
}

class test {
    public static void main(String[] args) {
        Llist ll = new Llist();
        ll.add("Тест1");
        ll.add("Тест2");
        ll.add("Тест3");
        int count = ll.size();
        System.out.println(ll.get(1));
        System.out.println("List size = " + count);
    }

}