// Problem: https://leetcode.com/problems/implement-strstr/

// COMPILE & RUN: `javac Implement_Strstr.java && java Implement_Strstr`

public class Implement_Strstr {

    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        } else if (needle.length() == 0 || haystack.equals(needle)) {
            return 0;
        } else {
            if (haystack.contains(needle)) {
                // check length of needle
                if (needle.length() > 1) {
                    for (int i = 0; i < haystack.length(); i++) {
                        int sliceEnd = i + needle.length();
                        if (i < (haystack.length() - needle.length())) {
                            String inspectionGroup = haystack.substring(i, sliceEnd);
                            if (inspectionGroup.equals(needle)) {
                                return i;
                            }
                        }
                    }
                } else {
                    for (int i = 0; i < haystack.length(); i++) {
                        Character haystackLetter = haystack.charAt(i);
                        Character needleLetter = needle.charAt(0);
                        if (haystackLetter.equals(needleLetter)) {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Implement_Strstr examples = new Implement_Strstr();
        System.out.println(examples.strStr("haystack", "needle"));

        /*
         * Input: haystack = "aaaaa", needle = "bba" Output: -1
         */
        System.out.println(examples.strStr("aaaaa", "bba"));

        /*
         * Input: haystack = "hello", needle = "ll" Output: 2
         */
        System.out.println(examples.strStr("hello", "ll"));

        /*
         * Input: haystack = "", needle = "" Output: 0
         */
        System.out.println(examples.strStr("", ""));

        /*
         * Input: haystack = "", needle = "a" Output: -1
         */
        System.out.println(examples.strStr("", "a"));

        /*
         * Input: haystack = "a", needle = "" Output: 0
         */
        System.out.println(examples.strStr("a", ""));

        /*
         * Input: haystack = "mississippi", needle = "issip" Output: 4
         */
        System.out.println(examples.strStr("mississippi", "issip"));

        /*
         * Input: haystack = "abc", needle = "c" Output: 2
         */
        System.out.println(examples.strStr("abc", "c"));
    }
}
