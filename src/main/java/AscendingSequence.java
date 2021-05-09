public class AscendingSequence {

    public int[] buildAscendingArray (int startNumber, int endNumber) {

        int[] array = new int[endNumber - startNumber + 1];

        for (int i = 1; i < endNumber - startNumber + 1; i ++) {
            array[i - 1] = i;
            System.out.println(array[i]);
        }
        return array;

    }
}
