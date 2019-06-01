package com.studio678;

public class Main {

    public static void main(String[] args) {
	//test app
        //shuld return true
        if(XO.getXO("ooxx")) {
            System.out.println("XO(\"ooxx\") =>  true : PASS");
        }else{
            System.out.println("XO(\"ooxx\") =>  false : NOT PASS");
        }
        //should return false
        if(XO.getXO("xooxx")) {
            System.out.println("XO(\"xooxx\") =>  true : NOT PASS");
        }else{
            System.out.println("XO(\"xooxx\") =>  false : PASS");
        }
        //should return true
        if(XO.getXO("ooxXm")) {
            System.out.println("XO(\"ooxXm\") =>  true : PASS");
        }else{
            System.out.println("XO(\"ooxXm\") =>  false : NOT PASS");
        }
        // when no 'x' and 'o' is present should return true
        if(XO.getXO("zpzpzpp")) {
            System.out.println("XO(\"zpzpzpp\") =>  true : PASS");
        }else{
            System.out.println("XO(\"zpzpzpp\") =>  false : NOT PASS");
        }
        //should return false
        if(XO.getXO("zzoo")) {
            System.out.println("XO(\"zzoo\") =>  true : NOT PASS");
        }else{
            System.out.println("XO(\"zzoo\") =>  false : PASS");
        }
    }
}


