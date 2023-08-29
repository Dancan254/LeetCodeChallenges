package Strings;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Given an array of strings words and a string s, determine if s is an acronym of words.
 *
 * The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order. For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
 *
 * Return true if s is an acronym of words, and false otherwise.
 * Example 1:
 *
 * Input: words = ["alice","bob","charlie"], s = "abc"
 * Output: true
 * Explanation: The first character in the words "alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym.
 */
public class StringAcronym {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
//        words.add("Ian");
//        words.add("Mongs");

        //add elements to the list
        Scanner sn = new Scanner(System.in);
        //enter five words for example
        System.out.println("Enter expected acronym:");
        String acronym = sn.nextLine();
        System.out.println("How many words do you want ot input? ");

        int size = sn.nextInt();
        sn.nextLine();
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter words: ");
            String wordLists = sn.nextLine();
            words.add(wordLists);
        }

        boolean flag = isAcronym(words, acronym);
        System.out.println(flag);
        sn.close();
    }

    //takes an arrayList of Strings and compares it with the string Acronym
    public static boolean isAcronym(List<String> words, String s) {
        //create a string builder to create the acronym
        StringBuilder acronym = new StringBuilder();
        //comparing the first char of each word with the string
        //first iterate through each word
        for (String word : words){
            //check if the word is not empty
            if (!word.isEmpty()){
                acronym.append(word.toLowerCase().charAt(0));//adds the first char of the word to the acronym builder
            }
        }

        //convert the string builder to a string
        String formedAcronym = acronym.toString();
        return formedAcronym.equals(s.toLowerCase());
    }

}
