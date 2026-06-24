package Strings;

public class ReverseOrderOfWords {
    public static void main(String[] args){
        String s = "Java is a coding language";
       // String[] array = s.split("\\s+");

        // - `split("\\s+")` means: “split on **one or more whitespace** characters.”
        //- `\\s` = whitespace (space, tab, newline); `+` = one or more.
        //- Using `\\s+` makes it **robust**: it treats multiple spaces between words as a **single separator**.
        //    - Example: `"hello world"` → `["hello", "world"]` (no empty items)
        //
        //> If you used split(" "), multiple spaces would create empty strings in the array, which you’d have to handle manually.
        //>

//        for(int i =array.length-1;i>=0;i--)
//        {
//            System.out.print(array[i]+" ");
//        }

        // Using STRING BUILDER

//        StringBuilder sb = new StringBuilder();
//        for(int i =array.length-1;i>=0;i--){
//            sb.append(array[i]);
//            sb.append(" ");
//
//        }
       // System.out.println(sb.toString().trim()); trim() removes leading and trailing whitespace (spaces, tabs, etc.).
        //System.out.println(sb);

        // NOT USING SPLIT()

        String result ="";
        String word="";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' '){
                result = word +" "+result;
                word="";
            }
            else{
                word=word + ch;
            }

        }
        result = word+" "+ result;
        System.out.println(result);

      // after last word "easy" there is no space still that "easy" word stored in word

// word = ""; to reset the current word
// word is used to accumulate characters of the current word.
//When we hit a space (ch == ' '), that means the current word is complete.
//We then prepend that word to result:
      //  result = word + " " + result;



    }
}
