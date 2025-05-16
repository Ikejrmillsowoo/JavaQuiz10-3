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
        String[] arr = string.split("");
        Set<String> newArr = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (isPalin(string.substring(i,j+1))) {
                    newArr.add(string.substring(i,j+1));
                }
            }
        return null;
    }

    public Boolean isPalindrome(){
        return this.input.equals(reverseString());
    }

    public String reverseString(){
        StringBuilder sb = new StringBuilder(this.input);
        return sb.reverse().toString();
    }
}
