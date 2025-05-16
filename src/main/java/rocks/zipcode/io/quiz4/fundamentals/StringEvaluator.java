package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {


    public static String[] getAllSubstrings(String string) {
        String[] arr = string.split("");
        Set<String> newArr = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                newArr.add(string.substring(i,j+1));
            }
        }
       return newArr.toArray(new String[0]);

    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] str1 = getAllSubstrings(string1);
        String[] str2 = getAllSubstrings(string2);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if equals(str2[j])){
                    set.add(str1[i]);
                }
            };

        }





    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
