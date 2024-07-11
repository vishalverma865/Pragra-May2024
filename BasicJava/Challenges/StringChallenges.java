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



    public String withoutX2(String str) {

        if(str.substring(0,1).equals("x") && str.substring(1,2).equals("x")) {
            System.out.println("1st");
            return str.substring(2, str.length());

        }
        else if(str.substring(0,1).equals("x")) {
            System.out.println("2nd");
            return str.substring(1, str.length());
        }

        else if(str.substring(1,2).equals("x")) {
            System.out.println("3rd");
            return  str.substring(0,1) + str.substring(3, str.length());
        }
        else {
            return str;
        }

    }
    public String doubleChar(String str) {
StringBuffer strArray = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
        strArray.append(str.substring(i,i+1) + str.substring(i,i+1));
        }

        return strArray.toString();
    }
//Alternate of String Buffer
    public String doubleCharr(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
            // Alternately:
            // result = result + str.substring(i, i+1) + str.substring(i, i+1);
        }
        return result;
    }



    public int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i') {
                count ++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+3).equals("cat")) {
                catCount++;
            }
        }
        for (int j = 0; j < str.length(); j++) {
            if(str.substring(j,j+3).equals("dog")) {
                dogCount++;
            }
        }

        if(catCount == dogCount){
            return true;
        }
        return false;
    }












}
