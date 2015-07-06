

package intuitivesorter;

import java.math.BigInteger;
import java.util.Comparator;

/**
 *
 * @author evc1996
 */

public class ComparatorImpl implements Comparator<String> {
    
    //Checks if a character is a digit 0-9
    private boolean isDigit(char ch) {
        int asciiVal = (int) ch;
        
        //The ASCII values for digits 0-9 range from 48-57. 
        return asciiVal >= 48 && asciiVal <= 57;
    }
    
    //Returns a string of sequential numbers in a string
    public String getNumberString(String s, int marker) {
        String numberString = "";
        char ch = s.charAt(marker);
        boolean numberStringFound = false;
        
        
        //Search for a digit throughout the string until reaching the end 
        //  of the string
        while (!isDigit(ch) && marker < s.length()) {
            ch = s.charAt(marker);
            if (!isDigit(ch)) {
                marker += 1;
            }   
        }
        
        //While we haven't reached a non-numerical character yet and the
        //  entire string hasn't been searched through, build the number string
        //  by concatenating each number character together
        if (isDigit(ch)) {
            while (marker < s.length() && !numberStringFound) {
                ch = s.charAt(marker);
                if (!isDigit(ch)) {
                    numberStringFound = true;
                }
                else {
                    numberString += ch;
                    marker += 1;
                }
            }
        }
        
        return numberString;
    }

    @Override
    //Compares two strings and returns an integer value based on the
    //  lexiographic order of the strings: 
    //  negative integer if the first is before the second,
    //  positive integerif the second is before the first,
    //  and 0 if they're equal.
    public int compare(String string1, String string2){
        string1 = string1.toLowerCase().trim();
        string2 = string2.toLowerCase().trim();
        
        int returnValue = 0;
        int index = 0;

        boolean returnValueFound = false;
        boolean indexInBounds = (index < string1.length()) && (index < string2.length());
        
        BigInteger number1;
        BigInteger number2;
        BigInteger difference;
        String numberString1;
        String numberString2;
        
        //If the strings aren't equal, then find out which one is lexiographically
        // greater than the other. Otherwise the value of 0 will be returned.
        if (!string1.equals(string2)) {
            
            //While we haven't iterated through one of the entire strings and we haven't
            //  determined the lexiographic order, continue comparing each character of
            //  the two strings
            while ((indexInBounds) && (!returnValueFound)) {
               
                //If both characters are digits, build two strings of sequential 
                //  digits in each string, starting at the "index" value,
                //  and compare the two integers.
                if(isDigit(string1.charAt(index)) && isDigit(string2.charAt(index))) {
                    numberString1 = getNumberString(string1, index);
                    numberString2 = getNumberString(string2, index);
                    number1 = new BigInteger(numberString1);
                    number2 = new BigInteger(numberString2);

                    if (!number1.equals(number2)) {
                        difference = number1.subtract(number2);
                        returnValue = difference.intValue();
                        returnValueFound = true;
                    }

                    else {
                        index += numberString1.length();
                    }
                }
                
                //If one of the two characters is not a digit, check for the equality of 
                //  the two characters
                else {
                    
                    //If the characters aren't equal, then return the difference 
                    // of their ASCII values
                    if(string1.charAt(index) != string2.charAt(index)) {
                        BigInteger ascii1 = BigInteger.valueOf((int)string1.charAt(index));
                        BigInteger ascii2 = BigInteger.valueOf((int)string2.charAt(index));
                        difference = ascii1.subtract(ascii2);
                        returnValue = difference.intValue();
                        returnValueFound = true;
                    }
                    
                    //If they are equal, continue comparing the rest of the characters
                    else {
                        index += 1;
                    }
                        
                }
                
                //Check if the index has gone out of bounds
                indexInBounds = (index < string1.length()) && (index < string2.length());
            }
    
        }
        
        //If the index has gone out of bounds, then the two strings were equal up
        //  until that index. Thus, we return the difference of the 
        //  length of the two strings.
        if (!indexInBounds) {
            difference = BigInteger.valueOf(string1.length()).subtract(BigInteger.valueOf(string2.length()));
            returnValue = difference.intValue();
        }
        
        return returnValue;
    }
}
