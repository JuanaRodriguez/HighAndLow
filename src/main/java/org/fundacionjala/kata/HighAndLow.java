package org.fundacionjala.kata;

import java.util.Collections;
import java.util.List;

/**
 * The class calculate the maximum and minimum number of a list.
 */
public class HighAndLow {
    /**
     * The method calculate the high and low of a list.
     *
     * @param list contains the values.
     * @return actualResult, string with the  maximum and minimum values.
     */
    public String calculateHighAndLow(final List list) {
        String actualResult = Collections.max(list) + " " + Collections.min(list);
        return actualResult;
    }
}
