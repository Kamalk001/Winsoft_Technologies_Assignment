import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = input.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        int totalCount = 0;
        for (int count : wordCountMap.values()) {
            totalCount += count;
        }

        return totalCount;
    }
}
