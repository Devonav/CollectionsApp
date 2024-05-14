/*
 * Name: [Devon Villalona]
 * Course: [COP3330.CRN12565]
 * Date: [9/6/2023]
 *
 * Program Objective:
 * This program demonstrates the usage of major classes in the Collections framework.
 * It performs operations such as adding names to a list, sorting, shuffling, searching,
 * and converting between lists and arrays.
 *
 * Inputs:
 * The program does not take any user input for this demonstration.
 *
 * Outputs:
 * The program will print the list of names in their original order, sorted order,
 * shuffled order, and after converting between list and array. It will also display
 * the results of searching for specific names in the list.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates various operations on a list of names using the Collections framework.
 */
public class CollectionsProject {


     // The main method where all operations are performed.
    public static void main(String[] args) {
        // Create and Print a List
        ArrayList<String> names = new ArrayList<>();

        // Adding eight names to the list
        names.addAll(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah"));

        System.out.println("Original List:");
        // Using enhanced for loop to print names
        for (String name : names) {
            System.out.println(name);
        }

        // Sort the List
        Collections.sort(names);
        System.out.println("\nSorted List:");
        // Printing sorted names
        for (String name : names) {
            System.out.println(name);
        }

        // Shuffle the List
        Collections.shuffle(names);
        System.out.println("\nShuffled List:");
        // Printing shuffled names
        for (String name : names) {
            System.out.println(name);
        }

        // Search the List
        // Using binary search to find the index of "Alice"
        int index = Collections.binarySearch(names, "Alice");
        System.out.println("\n'Alice' found at index: " + index);

        // Searching for a name not in the list
        index = Collections.binarySearch(names, "Zoe");
        System.out.println("'Zoe' not found, returned index: " + index);

        // Convert the List to an Array
        String[] namesArray = names.toArray(new String[0]);
        System.out.println("\nArray from List:");
        // Printing names from the array
        for (String name : namesArray) {
            System.out.println(name);
        }

        // Convert the Array back into a List
        List<String> namesList = Arrays.asList(namesArray);
        System.out.println("\nList from Array:");
        // Printing names from the list
        for (String name : namesList) {
            System.out.println(name);
        }

        /*
        Collections vs. Collection:
        'Collection' is an interface in the Java Collections Framework and represents a group of objects.
        It provides the foundational methods that every collection will have (like add, remove, etc.).

        'Collections' is a utility class that provides static methods to operate on or return collections.
        It contains methods like sort, shuffle, etc.

        More broadly, a class is a blueprint for creating objects and can have fields, methods, and constructors.
        An interface, on the other hand, is a completely abstract type that only contains abstract methods.
        Classes implement interfaces, and interfaces can extend other interfaces.

        Sources: Java Documentation (https://docs.oracle.com/javase/8/docs/api/)
        */
    }
}

