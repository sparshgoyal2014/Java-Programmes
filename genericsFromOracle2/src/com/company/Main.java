package com.company;

class Node<T> {

    public T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

class MyNode extends Node<Integer> {
    public MyNode(Integer data){
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        MyNode mn = new MyNode(5);
        Node n = mn;            // A raw type - compiler throws an unchecked warning
//        n.setData("Hello");   // unchecked means during compile time the code is compiled fine but it does not guarantee the future (the time when the code actually runs), but atleast it provides you the warnings (like unchecked :- it says I am not checking the types during compile time), in future it may or may not produce errors (thats why it is called run time error)
        Integer x = (mn.data);    // Causes a ClassCastException to be thrown.
//
//        Node node = new Node();
//        node.setData(2.3);
//        Integer integer = node.data;



//
//        // COMPLETLY SEPARATE CODE
//
        Node<Integer> node2 = new Node<>(5);
        Node node3 = new Node<>(2.3);  //raw type is used // in future may be run time error thrown
        Node node4 = node2;

//        Integer integer2 = node4.data;  // polymorphism dont work for fields, only method is used in case of polymprphism of child class

         Integer integer2 = node2.data;
//




    }
}
