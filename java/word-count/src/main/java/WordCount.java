import java.util.HashMap;
import java.util.Map;

class WordCount {
    public Map<String, Integer> phrase(String input) {
        String[] words = input.replaceAll("[^a-zA-Z'\\s0-9\\']", " ")
                .toLowerCase()
                .split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("'(\\w+)'", "$1");

            if (!word.isEmpty()) {
                if (wordCountMap.containsKey(word)) {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }

        }
        return wordCountMap;
    }

}

