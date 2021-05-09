import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingArrayHappyPath () {

        //A1
        int startNumber = 1;
        int endNumber = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        //A2
        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        //A3
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

        @Test
        public void testAscendingZeroCase() {

        //A1
        int startNumber = 0;
        int endNumber = 5;
        int[] expectedResult = {0,1, 2, 3, 4, 5};

        //A2
        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        //A3
        Assert.assertArrayEquals(expectedResult, actualResult);
        }

        @Test
        public void testAscendingNegativeNumber(){

        //A1
        int startNumber = -8;
        int endNumber = -1;
        int[] expectedResult = {-1,-2,-3,-4,-5,-6,-7,-8};

        //A2
        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        //A3
        Assert.assertArrayEquals(expectedResult, actualResult);

        }

        @Test
        public void testAscendingNegativePositiveNumber(){

        //A1
        int startNumber = -4;
        int endNumber = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        //A2
        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        //A3
        Assert.assertArrayEquals(expectedResult, actualResult);

        }
}
