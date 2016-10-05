import java.util.Collections;
import java.util.List;

/**
 * Created by JuanaRodriguez on 10/4/2016.
 */
public class HighAndLow {

    public String calculateHighAndLow(List list) {
        String actualResult = Collections.max(list)+" " + Collections.min(list);
        return actualResult;
    }
}
