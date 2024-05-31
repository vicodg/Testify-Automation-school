package Javacodingchallange;

public class JC2 {
    // Method to reverse words using recursion
    public static String reverseWords(String sentence) {
        sentence = sentence.trim();

        // Base case: if the sentence is empty, return it
        if (sentence.isEmpty()) {
            return sentence;
        }

        // Find the last word in the sentence
        int lastSpaceIndex = sentence.lastIndexOf(" ");
        String lastWord = sentence.substring(lastSpaceIndex + 1);

        // Recursively call reverseWords on the remaining sentence
        String remainingSentence = sentence.substring(0, lastSpaceIndex);
        return lastWord + " " + reverseWords(remainingSentence);
    }

    public static void main(String[] args) {
        String sentence = "I am the best AutomationTester";
        String reversedSentence = reverseWords(sentence);

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed words: " + reversedSentence);
    }

}
