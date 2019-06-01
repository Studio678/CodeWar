/*
    Check to see if a string has the same amount of 'x's and 'o's.
    The method must return a boolean and be case insensitive.
    The string can contain any char.

 */

package com.studio678;

import java.util.ArrayList;

class XO {


    static boolean getXO (String str) {
        int counterX = 0;
        int counterO = 0;
        //str to lower case
        String lowerStr = str.toLowerCase();
        //if sting contains x or o count them
        if(lowerStr.contains("x") || lowerStr.contains("o")){
            for(Character thisChar: lowerStr.toCharArray()){
                if(thisChar.equals('x')){
                    counterX++;
                }
                if(thisChar.equals('o')){
                    counterO++;
                }
            }
        }
        //if counters different false else true
        return counterO == counterX;


    }


}
