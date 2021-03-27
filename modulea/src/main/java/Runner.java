import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {

    private static final int SIZE_ARRAY = 1000;
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        int[] array = getFilledArray(SIZE_ARRAY);
        int elementToFind = 3;

        logger.info("Start binary search. Initial data: Start index - 0, " +
                "End Index - " + SIZE_ARRAY + ", Element to find - " + elementToFind);
        int numberElement = Algorithm.binarySearch(array, 0, SIZE_ARRAY, elementToFind);
        if (numberElement < 0) {
            logger.error("Array element not found");
        } else {
            logger.info("Binary search finish. Element index - " + numberElement);
        }

    }

    private static int[] getFilledArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
        return array;
    }

}
