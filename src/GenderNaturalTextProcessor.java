import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenderNaturalTextProcessor {

    public static String replaceGenderSpecificWords(String paragraph){
        // Define a map of gender-specific words and their corresponding gender-neutral replacements
        // You can extend this list based on your specific needs
        String[][] replacements = {
                {"he", "they"},
                {"him", "them"},
                {"his", "their"},
                {"daughter", "child"},
                {"man", "person"},
                {"wife", "spouse"},
        };
        // Iterate through the replacements and perform substitution
        for (String[] replacement: replacements){
            String regex = "\\b" + replacement[0] + "\\b";
            paragraph = paragraph.replaceAll(regex, replacement[1]);
        }

        return paragraph;

    }
    public static void main(String[] args) {
        // Example paragraph with gender-specific words
        String paragraph =  "He went to his office, and she went to her office.";

        // Process the paragraph and replace gender-specific words
        String processedParagraph = replaceGenderSpecificWords(paragraph);

        // Display the result
        System.out.println("Original: "+ paragraph);
        System.out.println("Proceed: "+ processedParagraph);
    }
}
