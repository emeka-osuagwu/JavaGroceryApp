package com.company;

import java.util.ArrayList;

// Grocery Class contains and extends all method require to perform CURD operations on our app
public class Grocery {

    // assign grocery to a Java ArrayList type
    private static ArrayList<String> grocery = new ArrayList<String>();

    // listItems -> list all item in the grocery array
    protected void addItem(String item){
        grocery.add(item);
    }

    // listItems -> list all item in the grocery array
    protected void listItems(){
        System.out.println("You have " + grocery.size() + " Items \n");

        // loop through the grocery to print out all the item in the array
        // Note that on line 18 we have "(i + 1)", this allows us add 1 to the position of the array element to get position 0 as 1, position 1 at 2 etc
        for ( int i = 0; i < grocery.size(); i++){
            System.out.println( (i + 1) +  " = "  + grocery.get(i));
        }
    }

    // removeItem -> removes item from grocery array list
    // Requires item position
    protected void removeItem(int position){

        // Note that we have (position - 1), this allows us delete element at position 1 as 0, position 2 as 1 etc
        grocery.remove((position - 1));
    }

    // updateItem -> update grocery item
    // Require item position, new value
    protected void updateItem(int position, String item){

        // Note that we have (position - 1), this allows us update element at position 1 as 0, position 1 as 2 etc
        grocery.set((position - 1), item);
    }

    // findItem -> fine grocery item by item value
    // Require item value
    protected String findItem(String item){
        
        int item_position = grocery.indexOf(item);

        if (item_position >= 0 ){
            return grocery.get(item_position);
        }

        return null;
    }
}
