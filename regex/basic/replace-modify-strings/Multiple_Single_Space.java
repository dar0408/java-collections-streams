class Multiple_Single_Space{
    public static void main(String[] args) {
       // Replace Multiple Spaces with a Single Space
       String text = "This    is  an     example   with  multiple spaces.";

       // Using replaceAll() with regex \s+ to replace multiple spaces with a single space
       String replacedText = text.replaceAll("\\s+", " ");

       // Printing original and modified strings
       System.out.println("Original String: " + text);
       System.out.println("Replaced String: " + replacedText);
    }
}