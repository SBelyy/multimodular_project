import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Algorithm {

    private static final Logger logger = LoggerFactory.getLogger(Algorithm.class);

    public static int binarySearch(int[] array, int elementToFind) {
        int endIndex = array.length;
        int startIndex = 0;
        return binarySearch(array, startIndex, endIndex, elementToFind);
    }

    public static int binarySearch(int[] array, int startIndex, int endIndex, int elementToFind) {
        if (endIndex >= startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            logger.debug("Search process. " + "Data: Start Index - {}," + " End index - {},"
                    + " Middle Index - {}.", startIndex, endIndex, middleIndex);
            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            }

            if (array[middleIndex] > elementToFind) {
                return binarySearch(array, startIndex, middleIndex - 1, elementToFind);
            } else {
                return binarySearch(array, middleIndex + 1, endIndex, elementToFind);
            }
        }
        return -1;
    }

}
