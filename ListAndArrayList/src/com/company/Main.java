package com.company;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItem();
                    break;

                case 5:
                    searchItem();
                    break;

                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }


    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print Choice options.");
        System.out.println("\t 1 - To pint the list of grocery item.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify the item to the list.");
        System.out.println("\t 4 - To remove an Item from the list.");
        System.out.println("\t 5 - To search an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please Enter the grocery Item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement Item: ");
        String newItem = scanner.nextLine();
        groceryList.modifygroceryItem(itemNo-1, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchItem(){
        System.out.print("item To search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Fount "+ searchItem + " in your grocery list.");
        }else{
            System.out.println(searchItem + "is not in your list.");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryLIst());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryLIst());

        String[] sArray = new String[groceryList.getGroceryLIst().size()];
        sArray = groceryList.getGroceryLIst().toArray(sArray);

    }
}




































