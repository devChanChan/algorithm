package ArraysStrings.one;

import java.util.HashMap;
import java.util.Map;

public class ArraysStringsIsUnique_Map { 
    public static void main(String args[]) {
        String test = "helowrd";
        if(isAllUnique(test))
            System.out.printf("%s has all unique characters.", test);
        else 
            System.out.printf("%s is not consisted of all unique characters.", test);
    }

    public static boolean isAllUnique(String str) {
        Map<Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (map.containsKey(character)) // Omega(1), Big O(n)
                return false;
            else
                map.put(character, "");
        }
        return true;
    }
}