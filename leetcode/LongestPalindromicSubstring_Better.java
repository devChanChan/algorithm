public class LongestPalindromicSubstring_Better {

  public static void main(String[] args) {
    System.out.println(longestPalindrome("babad"));
    //System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
  }

  public static String longestPalindrome(String s) {
    int len = s.length();
    if (len <= 1)
      return s;
    if (isPalindrome(s))
      return s;
    
    String longest = "";
    int[][] tmp = new int[len + 1][len + 1];

    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j <= len; j++) {
        if (tmp[i][j] == 0) {
          tmp[i][j] = 1;
          String sub = s.substring(i, j);
          if (isPalindrome(sub)) {
              if (longest.length() < sub.length()) {
                  longest = sub;
              }
          }
        } else {
          continue;
        }
      }
    }
    return longest;
  }

  public static boolean isPalindrome(String text) {
    int n = text.length();
    for (int i = 0; i < (n/2); i++) {
        if (text.charAt(i) != text.charAt(n - i - 1)) {
            return false;
        }
    }
    return true;
  }
}
