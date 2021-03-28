import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {

    private static final int SIZE_ARRAY = 1000;
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        int[] array = getFilledArray(SIZE_ARRAY);
        int elementToFind = 3;

        logger.debug("Start binary search. Initial data: Start index - {}, " +
                "End Index - {}" + ", Element to find - {}", 0, SIZE_ARRAY, elementToFind);
        int numberElement = Algorithm.binarySearch(array, 0, SIZE_ARRAY, elementToFind);
        if (numberElement < 0) {
            logger.debug("Array element not found");
        } else {
            logger.debug("Binary search finish. Element index - {}", numberElement);
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
