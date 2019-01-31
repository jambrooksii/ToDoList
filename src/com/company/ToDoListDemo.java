package com.company;

   /*     Write a program that manages a ToDo List. Your program should consist of at least (3) classes: ToDoList, ToDoListItem,
        and ToDoListDemo (you may use more classes if you see the need to do so).

        Each item on the to-do list should have a description and a state (ToDo, In Progress, or Done). Your program
        should allow the user to add items to the to-do list, display all existing items, display existing items by state
         (e.g., the user may only want to view In Progress items), edit existing items, and delete items.

        As always, be sure to initialize your project as a Git repository when you create it, and commit your code
        regularly (with descriptive commit messages) as you work.

        Bonus: Your program should allow the user to create multiple ToDoLists, and should permit the user to choose
        which ToDoList they want to access and modify.

        Feeling overwhelmed? Remember our tactic for breaking down requirements which we talked about on Friday with
        the Library app. Start with a requirements list!*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class ToDoListDemo {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        ToDoListItem addToList = new ToDoListItem();
        ToDoList displayList = new ToDoList();
        boolean playAgain = false;
        int userInput1;
        String userInput2;
        boolean again = false;
        int counter = 0;
        int addToo = 0;


        do {
            System.out.println("This is your to do list\n\n Press [1] Add Item\n\n Press [2] View full List \n\n Press " +
                    "[3]Edit ToDOList\n\n Press [4] View Completed \n\n Press [5] View Uncompleted List");

            userInput1 = scan1.nextInt();

            switch (userInput1) {
                case 1:
                    do {
                        //User is adding Task to List
                        System.out.println("Please enter what you need to do");
                        userInput2 = scan2.nextLine();

                        System.out.println("\n");
                        addToList.addTo(userInput2);
                        addToList.addtoUncomplete(userInput2);

                        System.out.println("\n");

                        //  counter++;
                        // addToo++;


                        System.out.println("\nDo you need to add another item\n\n [1] For Yes \n\n [2] For No");
                        userInput1 = scan1.nextInt();
                        if (userInput1 == 1) {

                            again = true;

                        } else if (userInput1 == 2) {
                            again = false;
                        } else
                            break;

                    } while (again == true);
                      break;

                case 2:
                    do {


                        addToList.displayList();

                        System.out.println("Do you want to view your list again \n [1] For Yes \n [2] For No");
                        userInput1 = scan2.nextInt();
                        if (userInput1 == 1) {
                            again = true;
                        } else if (userInput1 == 2) {
                            again = false;
                        }
                    } while (again == true);
                      break;

                case 3:

                    addToList.markItemComplete();
                    break;

                case 4:
                    addToList.displayCompletedList();
                    break;

                case 5:
                    addToList.displayListUncomplete();
                    break;
            }

            System.out.println("Back to Main Menu? \n\n [1] For Yes \n\n [2] for NO");
            userInput1 = scan1.nextInt();
            if(userInput1 == 1){
                playAgain = true;
            }else if(userInput1 == 2){
                playAgain = false;
            }
        } while (playAgain == true);

    }

}












