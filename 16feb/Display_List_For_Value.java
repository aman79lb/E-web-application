import java.util.*;

public class Display_List_For_Value
{


 public static void main(String[] args) {
        List<List<Object>> listOfLists = new ArrayList<>();

        // Add the sub-lists to the main list
        listOfLists.add(Arrays.asList(0));
        listOfLists.add(Arrays.asList(1, "Patricia Halford"));
        listOfLists.add(Arrays.asList(3, "Patrick Keating", "Christina", "John Henderson"));
        listOfLists.add(Arrays.asList(2, "Williams Enriqueta", "Mary Smith"));

        // Display the list of lists
        for (List<Object> list : listOfLists) {
            System.out.println(list);
        }
    }

}

/*
This program creates a List<List<Object>> called listOfLists, 
and adds each of the sub-lists to it using Arrays.asList(). 
Then it loops through the listOfLists and prints each sub-list using System.out.println().
 The output of this program will be:

 [0]
[1, Patricia Halford]
[3, Patrick Keating, Christina, John Henderson]
[2, Williams Enriqueta, Mary Smith]


*/


// user interactive
/*

import java.util.*;

public class ListOfLists {
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
}



*/