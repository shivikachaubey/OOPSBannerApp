

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Centralized Character Pattern Map
    private static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";

        renderBanner(word);
    }

    // Store all character patterns in HashMap
    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });
    }

    // Render banner using nested loops + StringBuilder
    private static void renderBanner(String word) {

        int height = patternMap.get(word.charAt(0)).length;

        for (int i = 0; i < height; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                lineBuilder.append(pattern[i]).append("   ");
            }

            System.out.println(lineBuilder.toString());
        }
    }
}