package Javacodingchallange;

import java.util.HashMap;
import java.util.Map;

public class JC6 {
    public static void main(String[] args) {
        String str1 = "Despite commuting at the peek hour";
        String str2 = "she was able to keep to time";

        boolean areAnagrams = checkAnagrams(str1, str2);

        if (areAnagrams) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    public static boolean checkAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCountMap1 = getCharacterCountMap(str1);
        Map<Character, Integer> charCountMap2 = getCharacterCountMap(str2);

        // Compare the two character count maps
        return charCountMap1.equals(charCountMap2);
    }

    // Method to get the character count map for a string
    public static Map<Character, Integer> getCharacterCountMap(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }
}
