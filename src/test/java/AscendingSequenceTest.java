import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingArrayHappyPath() {

        int startNumber = 1;
        int endNumber = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingArrayZeroCase() {

        int startNumber = 0;
        int endNumber = 5;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingArrayNegativeNumber() {

        int startNumber = -8;
        int endNumber = -4;
        int[] expectedResult = {-8, -7, -6, -5, -4};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingArrayNegativePositiveNumber() {

        int startNumber = -2;
        int endNumber = 3;
        int[] expectedResult = {-2, -1, 0, 1, 2, 3};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStringHappyPath() {
        String expectedResult = "1, 2, 3, 4, 5";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPrintAscendingSequence() {

        AscendingSequence ascendingSequence = new AscendingSequence();
        ascendingSequence.printAscendingSequence(1, 1000);

    }
}
