import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManhattanTest {

    Manhattan manhattan = new Manhattan();
    @Test
    @DisplayName("Zero distance between two points")
    public void initialDistance() {

        Point p1 = new Point(0,0);
        Point p2 = new Point(0,0);

        int expectedDistance = 0;
        int actualDistance = Manhattan.mGetDistance(p1, p2);

        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    @DisplayName("Should return distance 1")
    public void shouldReturnOne() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,1);

        int expectedDistance = 1;
        int actualDistance = Manhattan.mGetDistance(p1, p2);

        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    @DisplayName("Should return distance 10")
    public void shouldReturnTen() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(5,5);

        int expectedDistance = 10;
        int actualDistance = Manhattan.mGetDistance(p1, p2);

        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    @DisplayName("Should return 99")
    public void shouldReturn99() {

        int expectedDistance = 99;
        int actualDistance = Manhattan.mGetDistance(new Point(0,1), new Point(1,99));

        Assertions.assertEquals(expectedDistance, actualDistance);
    }
}
