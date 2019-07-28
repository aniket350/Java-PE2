package com.stackroute.pe2;

public class StringReverseAndPalindromeCheck {

    public String reverseAndPalindromeMethod(String inputString) {
        String result="";
        StringBuilder input1 = new StringBuilder();
        input1 = input1.append(inputString);

        input1 = input1.reverse();
        if (inputString.contentEquals(input1)) {

            result = "Given String is a palindrome";
            return result;
        }
        return "Given String is not a palindrome";
    }
}