package ArraysStrings.one;

public class ArraysStringsIsUnique_Array {
    public static void main(String args[]) {
        String test = "hellowrd";
        if (isAllUnique(test))
            System.out.printf("%s has all unique characters.", test);
        else 
            System.out.printf("%s is not consisted of all unique characters.", test);
    }

    public static boolean isAllUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {
                if (character == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}