import java.io.File;

import java.io.FileNotFoundException;

import java.util.Hashtable;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) throws FileNotFoundException {
        Hashtable<String,Integer> wordTable = new Hashtable<>();
        //Access the Jobs.txt file for reading, this should be in the same folder as the WordCounter program
        File book = new File("Jobs.txt");

        Scanner bookworm = new Scanner(book).useDelimiter("[^a-zA-Z]+");
    }




}
