public class LongestPalindromicSubstring {

  public static void main(String[] args) {
    System.out.println(longestPalindrome("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa"));
  }

  public static String longestPalindrome(String s) {
    if (s.length() == 1)
      return s;
    if (isPalindrome(s))
      return s;
    
    String longest = "";
    for (int i = 0; i < s.length(); i++) {
        for (int j = i + 1; j <= s.length(); j++) {
            String sub = s.substring(i, j);
            if (isPalindrome(sub)) {
                if (longest.length() < sub.length()) {
                    longest = sub;
                }
            }
        }
    }
    return longest;
  }

  public static boolean isPalindrome(String text) {
      StringBuilder plain = new StringBuilder(text);
      StringBuilder reverse = new StringBuilder(text).reverse();
      boolean result = (reverse.toString()).equals(plain.toString());
      return result;
  }
}
