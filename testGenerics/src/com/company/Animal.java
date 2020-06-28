package com.company;

import java.beans.BeanInfo;

public class Animal< T > {
    T field1 = (T)new Bird();  // unchecked cast : Bird to T

    T t;

    public void display(){
//        System.out.println(field1 instanceof Bird);
//        System.out.println(field1 instanceof Dog);

////      Bird bird = (Bird) field1;
//
//        System.out.println(field1.getClass().getName());
//        field1 = (T)new Dog();
//
//        System.out.println(field1 instanceof Bird);
//        System.out.println(field1 instanceof Dog);

        System.out.println(field1);



//      System.out.println(bird.name);

//        System.out.println((Car)field1);

        System.out.println(((T)new Bird()));
        System.out.println(((Object) new Bird()).getClass().getName());
        System.out.println(((Object)new Bird()));

        Car car = new Buggati();
        System.out.println(car.getClass().getName());

        t = (T)new Car();
        System.out.println(t.getClass());
    }
}
