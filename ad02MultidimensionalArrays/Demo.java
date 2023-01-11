package JavaAdvanced.ad02MultidimensionalArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = new String[]{"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        Map<Character, Integer> characterCountMap = new LinkedHashMap<>();


        for (int index = 0; index < text.length; index++) {
            String currentWord = text[index];

            getCharCountOfCurrentWord(characterCountMap, currentWord);
        }


        printMap(characterCountMap);
    }

    private static void printMap(Map<Character, Integer> characterCountMap) {
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static void getCharCountOfCurrentWord(Map<Character, Integer> characterCountMap, String currentWord) {
        for (int i = 0; i < currentWord.length(); i++) {
            char currentChar = currentWord.charAt(i);
            if (!characterCountMap.containsKey(currentChar)) {
                characterCountMap.put(currentChar, 1);
            } else {
                int currentCount = characterCountMap.get(currentChar);
                currentCount++;
                characterCountMap.put(currentChar, currentCount);
            }
        }
    }
}
