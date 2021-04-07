package com.company;

public class Node<T> {
    public T data;

    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

class MyNode extends Node<?> {
    public MyNode(Integer data) { super("oanfe"); }

//    public void setData(Integer data) {
//        System.out.println("MyNode.setData");
//        super.setData(data);
//    }
}
