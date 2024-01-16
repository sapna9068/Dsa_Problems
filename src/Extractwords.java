import java.util.ArrayList;
import java.util.List;
    public class Extractwords {
        public static List<String> extractWordsByLength(String input, int[] criteria) {
            List<String> result = new ArrayList<>();
            String[] parts = input.split("\\$");

            for (int i = 0; i < parts.length; i++) {
                String[] wordAndLength = parts[i].split("\\d+");
                String word = wordAndLength[1];
                int length = Integer.parseInt(parts[i].replaceAll("\\D+", ""));

                if (length == criteria[i]) {
                    result.add(word);}}
            return result;
        }
        public static void main(String[] args) {
            String input = "Grapes8$Mango6$Apple5";
            int[] criteria = { 8, 6, 5 };
            List<String> extractedWords = extractWordsByLength(input, criteria);
            System.out.println("Words matching length criteria: " + extractedWords);
        }}
