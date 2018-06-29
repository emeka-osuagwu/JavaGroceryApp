package com.company;

import java.util.ArrayList;

public class Grocery {

    private static ArrayList<String> grocery = new ArrayList<String>();

    protected void listItems(){
        System.out.println("You have " + grocery.size() + " Items \n");
        for ( int i = 0; i < grocery.size(); i++){
            System.out.println( (i + 1) +  " = "  + grocery.get(i));
        }
    }

    protected void addItem(String item){
        grocery.add(item);
    }

    protected void removeItem(int position){
        grocery.remove((position - 1));
    }

    protected void updateItem(int position, String item){
        grocery.set(position, item);
    }

    protected String findItem(String item){
        int item_position = grocery.indexOf(item);

        if (item_position >= 0 ){
            return grocery.get(item_position);
        }

        return null;
    }
}
