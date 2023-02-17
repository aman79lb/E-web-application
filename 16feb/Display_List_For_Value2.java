import java.util.*;

public class Display_List_For_Value2 {
	
	  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Object>> listOfLists = new ArrayList<>();

        // Prompt user to enter number of sub-lists
        System.out.print("Enter the number of sub-lists: ");
        int numSubLists = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Loop through and add each sub-list
        for (int i = 1; i <= numSubLists; i++) {
            System.out.printf("Enter the size of sub-list #%d: ", i);
            int size = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            List<Object> subList = new ArrayList<>();
            subList.add(size);

            for (int j = 1; j <= size; j++) {
                System.out.printf("Enter element #%d of sub-list #%d: ", j, i);
                Object value = scanner.nextLine();
                subList.add(value);
            }

            listOfLists.add(subList);
        }

        // Display the list of lists
        for (List<Object> list : listOfLists) {
            System.out.println(list);
        }
    }

    /*
    In the modified program, the string "#%d" is used as a placeholder for the value of the loop counter variable.

The %d part of the string is a format specifier for an integer value, and the # character is used to specify the start of the format specifier.

In the printf statement, the value of i is passed as an argument to the printf method, which replaces the %d format specifier with the value of i.

For example, when i is 2, the string "#%d" is replaced with #2. 
This is used to provide the user with a message that indicates the current sub-list and the current element being entered

    */
	

		
}

/*
import java.util.ArrayList;: This line imports the ArrayList class from the java.util package. This class is used to create an array-based implementation of the List interface.

import java.util.List;: This line imports the List interface from the java.util package. This interface defines the behavior of a collection that stores an ordered sequence of elements.

import java.util.Scanner;: This line imports the Scanner class from the java.util package. This class is used to read user input from the console.

public class ListSizeDemo {: This line starts the definition of the ListSizeDemo class, which contains the main method.

Scanner scanner = new Scanner(System.in);: This line creates a new Scanner object, which is used to read input from the console.

List<List<String>> list = new ArrayList<>();: This line creates a new ArrayList object and assigns it to the variable list. The ArrayList is initialized with a capacity of 10 by default.

System.out.print("Enter the number of lists: ");: This line prints a message to the console prompting the user to enter the number of sub-lists they want to create.

int numLists = scanner.nextInt();: This line reads an integer value from the console using the Scanner object and assigns it to the variable numLists.

for (int i = 0; i < numLists; i++) {: This line starts a for loop that will run numLists times. The loop variable i is used to keep track of the current sub-list being entered.

System.out.printf("Enter the size of list #%d: ", i + 1);: This line prints a message to the console prompting the user to enter the size of the current sub-list.

int listSize = scanner.nextInt();: This line reads an integer value from the console using the Scanner object and assigns it to the variable listSize.

List<String> subList = new ArrayList<>();: This line creates a new ArrayList object and assigns it to the variable subList. This list will contain the elements of the current sub-list.

for (int j = 0; j < listSize; j++) {: This line starts a for loop that will run listSize times. The loop variable j is used to keep track of the current element being entered.

`System.out.printf("Enter element #%d for list #%d: ", j +



*/