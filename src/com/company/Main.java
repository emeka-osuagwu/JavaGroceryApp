package com.company;

import java.util.Scanner;

public class Main {

    private static boolean quit = false;
    private static Scanner scanner = new Scanner(System.in);
    private static Grocery grocery = new Grocery();

    public static void main(String[] args){

        while (!quit){

            ShowOption();

            int option = scanner.nextInt();

            switch (option) {
                case 0:
                    break;
                case 1:
                    listGrocerys();
                    break;
                case 2:
                    addGrocerys();
                    break;
                case 3:
                    removeGrocery();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    findGrocery();
                    break;
                case 6:
                    System.out.println("Application stopped running");
                    quit = true;
                    break;
            }
        }
    }

    public static void ShowOption(){
        System.out.println("\n Press");
        System.out.println("\t 0 - To print options.");
        System.out.println("\t 1 - To print the list of grocery item.");
        System.out.println("\t 2 - To add item to list.");
        System.out.println("\t 3 - To remove item from list.");
        System.out.println("\t 4 - To modify an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit application.");
    }

    public static void listGrocerys(){
        grocery.listItems();
    }

    public static void addGrocerys(){
        System.out.print("Enter grocery item: ");
        scanner.nextLine();
        grocery.addItem(scanner.nextLine());
    }

    public static void removeGrocery(){
        System.out.print("Enter item position to be removed from grocery list: ");
        scanner.nextLine();
        grocery.removeItem(scanner.nextInt());
    }

    public static void modifyItem(){
        System.out.print("Enter item position: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new item value: ");
        String item = scanner.nextLine();
        grocery.updateItem(position, item);
    }

    public static void findGrocery(){
        System.out.print("Enter item: ");
        scanner.nextLine();
        String item = scanner.nextLine();
        if (grocery.findItem(item) !=null){
            System.out.println(item + " was found in the list.");
        }
        else {
            System.out.println(item + " was't found in the grocery list.");
        }
    }

}
