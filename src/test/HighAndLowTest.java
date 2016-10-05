import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by JuanaRodriguez on 10/4/2016.
 */
public class HighAndLowTest {

    HighAndLow highAndLow = new HighAndLow();
    List list1 = Arrays.asList("1 2 3 4 5".split(" "));
    List list2 = Arrays.asList("1 2 -3 4 5".split(" "));
    List list3 = Arrays.asList("1 9 3 4 -5".split(" "));
    @Test
    public void highAndLowTest1(){
        assertEquals("5 1", highAndLow.calculateHighAndLow(list1));
        assertEquals("5 -3", highAndLow.calculateHighAndLow(list2));
        assertEquals("9 -5", highAndLow.calculateHighAndLow(list3));
    }
}
