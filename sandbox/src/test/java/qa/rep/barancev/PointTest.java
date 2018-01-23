package qa.rep.barancev;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void distanceTest() {

        Point point1 = new Point(20, 15);
        Point point2 = new Point(34, 28);

        assertEquals(point1.distance(point2), 19.1049731745428);

    }

}
