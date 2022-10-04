public class Palindrome {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " isPalindrome: " + isPalindrome(s));
        }
    }


    public static String reverseString(String str){
        String new_str = "";
        for(int i = str.length() - 1; i > -1; i--)new_str += str.charAt(i);
        return new_str;
    }
            
    public static boolean isPalindrome(String str){
        return str.equals(reverseString(str));
    }
}