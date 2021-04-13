import java.io.File;

import java.io.FileNotFoundException;

import java.util.Hashtable;

import java.util.Locale;

import java.util.Map;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args){
        Hashtable<String,Integer> wordTable = new Hashtable<>();

        try{
        //Access the Jobs.txt file for reading, this should be in the same folder as the WordCounter program
        File book = new File("src/Jobs.txt"); //DANGER, MAKE SURE TO USE THE SAME PATH ON YOUR SYSTEM

        Scanner bookworm = new Scanner(book).useDelimiter("[^a-zA-Z]+");

        while (bookworm.hasNext()){

            String text = bookworm.next().toLowerCase(Locale.ROOT);

            if (text.length() > 0){

                Integer count = wordTable.get(text);

                wordTable.put(text, count == null ? 1 : (count + 1));
            }
        }
        int max = 0;

        String mostUsed = "there was no most used word";

        for (Map.Entry<String, Integer> entry : wordTable.entrySet()){
            System.out.printf("<%s> : <%s>\n", entry.getKey(), entry.getValue());
        }

    } catch(FileNotFoundException e){

            e.printStackTrace();
        }


    }
}
