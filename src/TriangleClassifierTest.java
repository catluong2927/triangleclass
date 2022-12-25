

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    void testTriangleClassifier0() {
        String expected = "Tam giác đều";

        String result = TriangleClassifier.isTriangleType(2,2,2);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier1() {
        String expected = "Tam giác cân";

        String result = TriangleClassifier.isTriangleType(2,2,3);
        assertEquals(expected, result);
    }
    @Test
    void testTriangleClassifier2() {
        String expected = "Tam giác thường";

        String result = TriangleClassifier.isTriangleType(3,4,5);
        assertEquals(expected, result);
    }
    @Test
    void testTriangleClassifier3() {
        String expected = "Không phải là tam giác";

        String result = TriangleClassifier.isTriangleType(8,2,3);
        assertEquals(expected, result);
    }
    @Test
    void testTriangleClassifier4() {
        String expected = "Không phải là tam giác";

        String result = TriangleClassifier.isTriangleType(-1,2,1);
        assertEquals(expected, result);
    }
    @Test
    void testTriangleClassifier5() {
        String expected = "Không phải là tam giác";

        String result = TriangleClassifier.isTriangleType(0,1,1);
        assertEquals(expected, result);
    }

}
