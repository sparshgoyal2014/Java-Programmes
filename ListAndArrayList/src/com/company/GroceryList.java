package com.company;

import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class GroceryList {
    private ArrayList<String> groceryLIst = new ArrayList<String>();

    public ArrayList<String> getGroceryLIst() {
        return groceryLIst;
    }

    public void addGroceryItem(String item){
        groceryLIst.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryLIst.size() + " items in your grocery list");
        for(int i=0; i<groceryLIst.size(); i++){
            System.out.println((i+1) + ". " + groceryLIst.get(i));
        }
    }

    public void modifygroceryItem(int position, String newItem){
        groceryLIst.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(int position){
        String removedItem = groceryLIst.get(position);
        groceryLIst.remove(position);
    }

    public String findItem(String searchItem){
        /*
        boolean exits = groceryLIst.contains(searchItem);
        if(exits){

        }else{
            System.out.println(searchItem + " does not exits in your list.");
        }
         */


        int position = groceryLIst.indexOf(searchItem);
        if(position >= 0){
            return groceryLIst.get(position);
        }

        return null;
    }
}



















