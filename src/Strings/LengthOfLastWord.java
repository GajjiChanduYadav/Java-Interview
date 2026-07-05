package Strings;

public class LengthOfLastWord {
    public static void main(String[] args){

        String str = "Hello Worldii  ";

        int length = str.length()-1;
        int count =0;

        while(length >=0 )
        {
                if(str.charAt(length)!= ' '){
                    count++;
                }
                else if(count >0){
                    break;
                }
                length--;
        }
        System.out.println(count);
    }

}
