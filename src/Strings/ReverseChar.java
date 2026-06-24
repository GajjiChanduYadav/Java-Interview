package Strings;

// Reverse characters in each word, keeping word order (e.g., "hello world" → "olleh dlrow")

public class ReverseChar {
    public static void main(String[] args) {
//        String s = "Hello World";
//
//        String result = "";
//        String word = "";
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(ch==' '){
//                result = result + " "+ word;
//                word="";
//            }
//            else{
//                word=ch+word;
//            }
//
//        }
//        result= result+" "+ word;
//        System.out.println(result);

//        String str = "Welcome To Java";     // Original String
//
//        String[] words = str.split(" ");    // Splitting string into words (on spaces)
//
//        String reverseString = "";          // Final result will be built here
//
//        for (String w : words) {            // For each word (e.g., "Welcome", "To", "Java")
//
//            String reverseword = "";        // Will hold the reversed version of the current word
//
//            for (int i = w.length() - 1; i >= 0; i--) {   // Traverse characters backward
//                reverseword = reverseword + w.charAt(i);  // Build reversed word by concatenation
//            }
//
//            reverseString = reverseString + reverseword + " "; // Append reversed word + space
//        }
//
//        System.out.println(reverseString.trim());  // Prints the final sentence (has trailing space)
//

        String str = "Welcome To Java";  // Original sentence

        // Split the sentence into words
        String[] words = str.split(" ");

        // StringBuilder to store the final result
        StringBuilder result = new StringBuilder();

        // Loop through each word
        for (String word : words) {
            // Use StringBuilder to reverse the word
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();  // Reverse the characters of the word

            // Append reversed word to result
            result.append(sb).append(" ");
        }

        // Print the final reversed sentence (trim removes extra space at the end)
        System.out.println(result.toString().trim());


}
}
