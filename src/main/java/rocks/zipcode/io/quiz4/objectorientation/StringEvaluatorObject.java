package rocks.zipcode.io.quiz4.objectorientation;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
            String str;
    public StringEvaluatorObject(String str) {
        this.str = str;
    }

    public String[] getAllSubstrings() {
        String[] arr = this.str.split("");
        Set<String> newArr = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                newArr.add(this.str.substring(i,j+1));
            }
        }
        return newArr.toArray(new String[0]);
    }

    public String[] getCommonSubstrings(String secondInput) {
        String[] str1 = getAllSubstrings();
        String[] str2;
        String[] arr = secondInput.split("");
        Set<String> newArr = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                newArr.add(secondInput.substring(i,j+1));
            }
        }
        str2 = newArr.toArray(new String[0]);
        Set<String> newSet = new HashSet<>();
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str2[j].equals(str1[i])){
                    newSet.add(str1[i]);
                }
            }
        }

        return newSet.toArray(new String[0]);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return null;
    }
}
