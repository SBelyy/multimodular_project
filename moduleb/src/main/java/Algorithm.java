import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Algorithm {

    private static final Logger logger = LoggerFactory.getLogger(Algorithm.class);

    public static int binarySearch(int[] array, int startIndex, int endIndex, int elementToFind) {
        if (endIndex >= startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            logger.info("Search process. " + "Data: Start Index - " + startIndex + ", End index - " +
                    endIndex + ", Middle Index - " + middleIndex + ".");
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
