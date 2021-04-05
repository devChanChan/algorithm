package ArraysStrings.nine;

public class StringRotation {
  public static void main (String[] args) {

    String str1 = "waterbottle";
    String str2 = "erbottlewat";

    if (isSubstring(str1, str2)) {
      System.out.println(str2 + " is a rotated string of " + str1);
    } else {
      System.out.println(str2 + " is NOT a rotated string of " + str1);
    }
  }

  public static boolean isSubstring(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    
    String s2s2 = s2 + s2;
    if (s2s2.contains(s1)) {
      return true;
    } else {
      return false;
    }
  }
}