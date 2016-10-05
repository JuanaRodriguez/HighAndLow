package org.fundacionjala.kata;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by JuanaRodriguez on 10/5/2016.
 */
public class TestHighAndLow {
    private HighAndLow highAndLow = new HighAndLow();
    private List list1 = Arrays.asList("1 2 3 4 5".split(" "));
    private List list2 = Arrays.asList("1 2 -3 4 5".split(" "));
    private List list3 = Arrays.asList("1 9 3 4 -5".split(" "));

    /**
     * The test verify the  maximum and minimum number of a list.
     */
    @Test
    public void highAndLowTest() {
        assertEquals("5 1", highAndLow.calculateHighAndLow(list1));
        assertEquals("5 -3", highAndLow.calculateHighAndLow(list2));
        assertEquals("9 -5", highAndLow.calculateHighAndLow(list3));
    }
}
