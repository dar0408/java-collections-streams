public class Bad_Words_Sentence {
    public static void main(String[] args) {
        // List of bad words to be censored
        String[] badWords = {"damn", "stupid"};

        // Sample text
        String text = "This is a damn bad example with some stupid words.";

        // Replacing each bad word with ****
        for(String word : badWords){
            text = text.replaceAll(word, "****");
        }

        System.out.println("Censored String: " + text);
    }
}
