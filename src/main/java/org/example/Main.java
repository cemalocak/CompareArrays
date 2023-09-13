package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0;i<10;i++){
            list1.add((int) (Math.random()*21));
        }
        for(int i=0;i<10;i++){
            list2.add((int) (Math.random()*21));
        }
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

//       list1.forEach(System.out::println);    BUNU BİLMİYORUM !!!!
        System.out.println("list1'de olup list2'de olmayan elemanlar :");
        list1.forEach(i -> {
           if (!list2.contains(i)) {
               System.out.print(i + " ");
           }
        } );
       System.out.println();

        System.out.println("list2'de olup list1'de olmayan elemanlar :");
        list2.forEach(i -> {
           if (!list1.contains(i)) {
               System.out.print(i + " ");
           }
        } );

       System.out.println();
        System.out.println("Ortak elemanlar :");
        list2.forEach(i -> {
           if (list1.contains(i)) {
               System.out.print(i + " ");
           }
        } );


    }
}