package p008.string.to.integer;

public class Solution {
    public int myAtoi(String str) {

        if (str == null) {
            return 0;
        }
        boolean minusFlag = false;
        boolean nonEmptyCharFlag = false;
        boolean startProperDigitFlag = false;
        boolean exceedingMaxValue = false;
        boolean exceedingMinValue = false;

        int returnInteger = 0;
        char[] charsArray = str.toCharArray();

        for (char charItem : charsArray) {
            if (startProperDigitFlag) {
                if (!nonEmptyCharFlag) {
                    break;
                }
            }

            if (charItem == ' ') {
                nonEmptyCharFlag = false;
                continue;
            }


            //below are for first actual non blank char

            if (charItem == '-' && !startProperDigitFlag) {

                minusFlag = true;
                startProperDigitFlag = true;
                nonEmptyCharFlag = true;
                continue;
            } else if (charItem == '+' && !startProperDigitFlag) {
                nonEmptyCharFlag = true;
                startProperDigitFlag = true;
                minusFlag = false;
                continue;
            }

            if (!Character.isDigit(charItem)) {
                break;
            } else {
                startProperDigitFlag = true;
                nonEmptyCharFlag = true;
                exceedingMaxValue = ((returnInteger > Integer.MAX_VALUE / 10) || (returnInteger == Integer.MAX_VALUE / 10 && Character.getNumericValue(charItem) >= 7));
                exceedingMinValue = ((returnInteger > Integer.MAX_VALUE / 10) || (returnInteger == Integer.MAX_VALUE / 10 && Character.getNumericValue(charItem) >= 8));
                if (!minusFlag && exceedingMaxValue) {
                    return Integer.MAX_VALUE;
                } else if (minusFlag && exceedingMinValue) {
                    return Integer.MIN_VALUE;
                }
                returnInteger = Character.getNumericValue(charItem) + returnInteger * 10;
            }
        }

        if (minusFlag) {
            return -1 * returnInteger;
        }
        return returnInteger;
    }
}
