package Javacodingchallange;


import java.util.*;

public class JC5 {
    public static void main(String[] args) {
        String[] input = {"akka", "akak", "baab", "baba", "bbaa"};
        Map<String, List<String>> anagramBuckets = createAnagramBuckets(input);

        for (Map.Entry<String, List<String>> entry : anagramBuckets.entrySet()) {
            System.out.println("Bucket for key " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, List<String>> createAnagramBuckets(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);

            String sortedWord = new String(charArray);
            anagramMap.putIfAbsent(sortedWord, new ArrayList<>());

            anagramMap.get(sortedWord).add(word);
        }

        return anagramMap;
    }
}
