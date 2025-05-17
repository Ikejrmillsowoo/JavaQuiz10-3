package rocks.zipcode.io.quiz4.objectorientation;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    private String input;

    public PalindromeObject(String input) {
        this.input = input;
    }

    public String[] getAllPalindromes(){
        String[] arr = this.input.split("");
        Set<String> newArr = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                StringBuilder newStr = new StringBuilder(this.input.substring(i, j + 1));
                if (newStr.toString().equals(newStr.reverse().toString())) {
                    newArr.add(newStr.toString());
                }
            }
        }
        return newArr.toArray(new String[0]);
    }

    public Boolean isPalindrome(){
        return this.input.equals(reverseString());
    }

    public String reverseString(){
        StringBuilder sb = new StringBuilder(this.input);
        return sb.reverse().toString();
    }
}
