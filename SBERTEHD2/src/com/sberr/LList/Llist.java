package com.sberr.LList;
import java.util.Scanner;
import com.sberr.LList.MistEx;
public class Llist<T> {
    private Node root;


    public void add(T obj) {
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

    public T get(int id){
        try {
            Node result = root;
            for (int i = 0; i < id - 1; i++) {
                result = result.next;
            }
            return(T) result.data;
        }catch (NullPointerException e)
        {
            return(T) "этого элемента не существует";
        }
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

class Node<T> {
    T data;
    Node next;

    public Node(T item){
        this.data = item;
    }
}

class test {
    public static void main(String[] args) throws MistEx {
        Llist ll = new Llist();
        Scanner in = new Scanner(System.in);
        ll.add("Тест1");
        ll.add("Тест2");
        ll.add("Тест3");
        ll.add("Привет");
        ll.add("Как дела?");
        ll.add("Как погода?");
        ll.add("Азаза");
        int count = ll.size();
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.get(3));
        System.out.println(ll.get(4));
        System.out.println(ll.get(5));
        System.out.println(ll.get(6));
        System.out.println(ll.get(7));
        System.out.println("Нулевой элемент "+ll.get(0));
       // System.out.println("Нулевой элемент больше size "+ll.get(8));
        System.out.println("Элемент меньше нуля "+ll.get(-1));
        System.out.println("List size = " + count);

        System.out.println("Введите какой элемент хотите вывести на экран?");
        int id = in.nextInt();
        if (id <= 0 || id >ll.size()) {
            throw new MistEx("Объекта не существует");
        }
        System.out.println("Получите ваш элемент: "+ll.get(id));
        System.out.println("Добавте элемент в лист: ");

        String str = in.next();
        ll.add(str);
        System.out.println("Получите ваш элемент: "+ll.get(8));

        System.out.println("Введите колличество элементов, которое хотите добавить в лист: ");
        int countt = in.nextInt();
        for(int i = 0;i<countt;i++)
        {
            System.out.println("Добавте элемент в лист: ");
            String rr = in.next();
            ll.add(rr);
        }
        count = ll.size();
        System.out.println("List size = " + count);

        System.out.println("Итоговый вид списка после операций: ");
        for(int i = 1; i<=count;i++)
        {
            System.out.println(ll.get(i));
        }


    }

}