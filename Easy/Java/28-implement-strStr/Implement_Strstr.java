// Problem: https://leetcode.com/problems/implement-strstr/

// COMPILE & RUN: `javac Implement_Strstr.java && java Implement_Strstr`

public class Implement_Strstr {

    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        } else {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0))
                    System.out.println("Found Letter");

            }
            return 1;
        }
    }

    public static void main(String[] args) {
        Implement_Strstr example1 = new Implement_Strstr();
        example1.strStr("haystack", "needle");
    }
}
