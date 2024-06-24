package BasicJava.Challenges;
/*
Given a string name, e.g. "Bob",
return a greeting of the form "Hello Bob!".
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!" */

public class StringChallenges {
//Task 1
    public String helloName(String name) {
    return "Hello" + name;
    }
    //Task2
/*
Given two strings, a and b, return the result of putting them
together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"

 */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
//Task3
/*
    Given an "out" string length 4, such as "<<>>", and a word, return a new
    string where the word is in the middle of the out string, e.g. "<<word>>".
    Note: use str.substring(i, j) to extract the String starting at index i and
    going up to but not including index j.
makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<<>>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
     */
public String makeOutWord(String out, String word) {
       int lengthOf =  out.length()/2;
    return out.substring(0,lengthOf) + word + out.substring(lengthOf,out.length());
}

//Task 4
    /*
    Given a string, return a new string made of 3 copies of the
     last 2 chars of the original string.
    The string length will be at least 2.
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
    */
public String extraEnd(String str) {
    return str.substring(1);
  //  return str.substring(str.length()-2, str.length()) + str.substring(str.length()-2, str.length());
}
//Task5
    /*
Given a string, return a "rotated right 2" version where the last 2
chars are moved to the start. The string length will be at least 2.
right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
     */
    public String right2(String str) {
        if(str.length()>2){
            return str.substring(str.length()-2) + str.substring(0,str.length()-3);
        }
        else {
            return str;
        }
    }


    //Task5




    public boolean endsLy(String str) {
        String str1 = str.substring(str.length()-2, str.length() );
        return str1.matches("ly");

    }









}
