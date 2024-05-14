package org.example;

public class Main {
    public static void main(String[] args) {
        //ex1 palindromeCheck
        //?abb??a -> aabbbaa
        //abb??a? -> NO
        //?a? -> aaa, zaz
        System.out.println(Solution.palindromeCheck("?abb??a"));
        System.out.println(Solution.palindromeCheck("abb??a?"));
        System.out.println(Solution.palindromeCheck("?a?"));


        //ex2 countMaxDuplicate
        //["ssc", "ssc", "cc", "pp"] -> 2
        //["ss", "ss", "pp", "pp", "pp"] -> 3
        //["ss", "f", "a", "b", "c"] -> 1
        System.out.println(Solution.countMaxDuplicate(new String[]{"ssc", "ssc", "cc", "pp"}));
        System.out.println(Solution.countMaxDuplicate(new String[]{"ss", "ss", "pp", "pp", "pp"}));
        System.out.println(Solution.countMaxDuplicate(new String[]{"ss", "f", "a", "b", "c"}));

        //ex3 maxConsecutiveNumbers
        //[1, 3, 4, 5, 7] -> 4 (1, 3, 5, 7) diff 2
        //[12, 12, 12, 5, 10] -> 3 (12, 12, 12) diff 0
        //[24, 24, 26, 26, 28, 28, 30, 30] -> 4 (24, 26, 28, 30) diff 2

        System.out.println(Solution.maxConsecutiveNumbers(new int[]{1, 3, 4, 5, 7}));
        System.out.println(Solution.maxConsecutiveNumbers(new int[]{12, 12, 12, 5, 10}));
        System.out.println(Solution.maxConsecutiveNumbers(new int[]{1, 3, 4, 5, 7}));
    }
}