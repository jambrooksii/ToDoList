package com.company;

import java.util.Scanner;

public class ToDoListItem {

    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    ToDoList add = new ToDoList();

    String userToDoListItem;
    String uncompleteItems;
    String completedItems;
    String check;
    String print = "";
    int counter;
    int addTNOw = 0;
    int userInput;
    boolean again = false;

    //Adding all the items to the All items list and printing out results.
    public void addTo(String userToDoListItem) {
        add.listItem.add(userToDoListItem);
        System.out.println("You Added" + add.listItem);
        System.out.println(add.listItem.size());


    }
//Adding List items to Uncompleted List
    public void addtoUncomplete(String uncompleteItems) {
        add.unCompletedItems.add(uncompleteItems);


    }
//Add items to complete list
    public void addtoComplete(String completeItems) {
        add.completedItems.add(completeItems);


    }
//Print out full list
    public void displayList() {
        System.out.println("The Items in your list are");
        for (int i = 0; i < add.listItem.size(); i++) {
            System.out.println("[" + counter + "] " + add.listItem.get(i) + ":\n");
            counter = counter + 1;
        }

        //System.out.println(add.listItem.size());
    }
//Printout Uncompleted List
    public void displayListUncomplete() {
        System.out.println("The Items in your Uncompleted list are");
        for (int i = 0; i < add.unCompletedItems.size(); i++) {
            System.out.println("[" + counter + "] " + add.unCompletedItems.get(i) + ":\n");
            counter = counter + 1;

        }
    }
//Printout Completed List
        public void displayCompletedList() {
            System.out.println("You have Completed these Items");
            for (int i = 0; i < add.completedItems.size(); i++) {
                System.out.println("[" + counter + "] " + add.completedItems.get(i) + ":\n");
                counter = counter + 1;
            }
        }



//Mark Items completed or delete items
    public void markItemComplete() {
        do {
        System.out.println("Press [2] to Mark Item Complete \n Press [1] to Delete Item");
        userInput = scan1.nextInt();

            if (userInput == 1) {
                System.out.println("Which item on your list do you want to delete \n Press the number of item you delete");
                displayList();
                userInput = scan2.nextInt();
                System.out.println(add.listItem.size());
                add.listItem.remove(userInput);

                displayList();
            } else if (userInput == 2) {
                System.out.println("Which of your task did you complete, Press number of item you completed");
                displayList();
                userInput = scan1.nextInt();
                add.completedItems.add(add.unCompletedItems.remove(userInput));
                displayListUncomplete();
                System.out.println("\n");
                displayCompletedList();


            }


            System.out.println("Do you want to edit another item");
            userInput = scan2.nextInt();
            if (userInput == 1) {
                again = true;
            } else if (userInput == 2) {
                again = false;
            }

        } while (again == true);
    }
}

