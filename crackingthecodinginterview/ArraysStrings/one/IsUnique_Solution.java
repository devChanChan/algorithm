package ArraysStrings.one;

public class IsUnique_Solution { 
    public static void main(String args[]) {
        
        String input = "helWord";

        if(isAllUnique(input)) 
            System.out.printf("%s has all unique characters.", input);
        else 
            System.out.printf("%s is not consisted of all unique characters.", input);
    }

    private static boolean isAllUnique(String str) {
        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int character = str.charAt(i);
            if (char_set[character])
                return false;
            char_set[character] = true;
        }
        return true;
    }
}